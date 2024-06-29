package com.consumer.smartnote.kafka;

import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.consumer.smartnote.bean.Action;
import com.consumer.smartnote.bean.Spe;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Objects;
import java.util.Optional;

/**
 * 从Kafka中消费商机台账操作数据推送至西咸Kafka
 *
 * @author chenfl
 */
@Slf4j
@Component
public class WebActionConsumer {

    @Value("${spring.kafka.xxKafka.producer.test-topic}")
    private String testTopic;
    @Value("${spring.kafka.xxKafka.producer.prod-topic}")
    private String prodTopic;

    @Value("${browserId.test.and}")
    private int testAndId;
    @Value("${browserId.test.ios}")
    private int testIosId;
    @Value("${browserId.prod.and}")
    private int prodAndId;
    @Value("${browserId.prod.ios}")
    private int prodIosId;

    @Resource
    @Qualifier("xxKafkaTemplate")
    private KafkaTemplate<String, String> xxKafkaTemplate;

    @KafkaListener(topics = {"${spring.kafka.tingyunKafka.consumer.topic}"}, concurrency = "${spring.kafka.tingyunKafka.consumer.concurrency}", containerFactory = "tingyunKafkaContainerFactory")
    public void handleData(ConsumerRecord<String, byte[]> record) {
        byte[] value = (byte[]) record.value();
        try {
            Action action = Action.parseFrom(value);
            Spe spe = action.getEvent().getSpe();
            if (Objects.isNull(spe)) {
                return;
            }
            if ("spe".equals(action.getSubType()) && "auto".equals(spe.getType())) {
                String content = spe.getContext();
                if (StrUtil.isNotBlank(content)) {
                    JSONObject json = (JSONObject) Optional.ofNullable(JSONUtil.parseObj(content)).orElse(new JSONObject());
                    String projectID = json.getStr("projectID", "no"); // 获取商机台账标签
                    if (spe.getKey().contains("_guest_") || "SMARTNOTE".equals(projectID)) {
                        json.put("timestamp", Long.valueOf(action.getTimestamp() / 1000L));
                        json.put("key", spe.getKey());
                        if (testAndId == action.getBrowserApplicationId() || testIosId == action.getBrowserApplicationId()) { //测试环境数据
                            xxKafkaTemplate.send(testTopic, json.toJSONString(0));
                            log.info("test：" + json);
                        }
                        if (prodAndId == action.getBrowserApplicationId() || prodIosId == action.getBrowserApplicationId()) { //生产环境数据
                            xxKafkaTemplate.send(prodTopic, json.toJSONString(0));
                            log.info("prod：" + json);
                        }
                    }
                }
            }
        } catch (Exception e) {
            log.error("process message error: " + e.getMessage(), e);
        }
    }
}
