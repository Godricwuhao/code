package com.consumer.liantongapp.kafka;

import java.util.Optional;

import javax.annotation.Resource;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.consumer.liantongapp.utils.JsonUtil;
import com.tingyun.app.datacollector.protobuf.bpi.MobileAppUxActionBpiMessageOuterClass.MobileAppUxActionBpiMessage;

import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;

/**
 * 从q-bpi-ux-action中消费App操作数据
 * 
 * @author cfl
 *
 */
@Slf4j
@Component
public class MobileAppUxActionConsumer {

	@Value("${spring.kafka.lzptKafkaDev.producer.topic}")
	private String devTopic;
	@Value("${spring.kafka.lzptKafkaProd.producer.topic}")
	private String prodTopic;

	@Value("${spring.kafka.lzptKafkaDev.tag}")
	private String devTag;
	@Value("${spring.kafka.lzptKafkaProd.tag}")
	private String prodTag;

	@Resource
	@Qualifier("lzptKafkaDevTemplate")
	private KafkaTemplate<String, String> lzptKafkaDevTemplate;
	@Resource
	@Qualifier("lzptKafkaProdTemplate")
	private KafkaTemplate<String, String> lzptKafkaProdTemplate;

	@KafkaListener(topics = { "${spring.kafka.tingyunKafka.consumer.topic}" }, concurrency = "8", containerFactory = "tingyunKafkaContainerFactory")
	public void handleData(ConsumerRecord<String, byte[]> record) {
		byte[] value = (byte[]) record.value();
		try {
			MobileAppUxActionBpiMessage message = MobileAppUxActionBpiMessage.parseFrom(value);

			if (StrUtil.isNotBlank(message.getCustomAdditionalInfo()) && StrUtil.isNotBlank(JsonUtil.read(message.getCustomAdditionalInfo(), "$.cust"))) { // 是否有埋点信息
				JSONObject content = (JSONObject) Optional.ofNullable(JSONUtil.parseObj(JsonUtil.read(message.getCustomAdditionalInfo(), "$.cust"))).orElse(new JSONObject()); // 获取cust埋点信息
				if ("LZPT".equals((content.getStr("data_identification", "no")))) { // 如果埋点信息中 data_identification 等于 LZPT 则推送流转平台
					content.put("ip", message.getIp()); // IP地址
					content.put("device_brand", message.getManufacturerName()); // 设备品牌
					content.put("device_model", message.getManufacturerModelName()); // 设备模式
					content.put("os", message.getOsName()); // 系统名称
					content.put("os_version", message.getMobileAppVersionName()); // 系统版本

					if (devTag.equals(JsonUtil.read(message.getCustomAdditionalInfo(), "$.tag"))) { // dev推送到测试环境
						lzptKafkaDevTemplate.send(devTopic, content.toJSONString(0));
						log.info(message.getTimestamp() + " ===>>> dev：" + content);
					}
					if (prodTag.equals(JsonUtil.read(message.getCustomAdditionalInfo(), "$.tag"))) { // dis推送到生产环境
						lzptKafkaProdTemplate.send(prodTopic, content.toJSONString(0));
						log.info(message.getTimestamp() + " ===>>> dis：" + content);
					}
				}
			}
		} catch (Exception e) {
			log.error("process message error: " + e.getMessage(), e);
		}
	}
}
