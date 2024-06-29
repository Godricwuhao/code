package com.unicom.kafka;

import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.unicom.bean.Action;
import com.unicom.bean.ImmediateEvent;
import com.unicom.bean.Spe;
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
 * 从brs-bpi-message消费Web埋点数据推送三方
 *
 * @author chenfl
 */
@Slf4j
@Component
public class WebActionConsumer {

    @Resource
    @Qualifier("xxKafkaTemplate")
    private KafkaTemplate<String, String> xxKafkaTemplate; //西咸KafkaTemplate

    @Value("${basicServicAlert.browserId}")
    private int basicServicAlertBrowserId; //联通APP基础服务应用ID

    @Value("${basicServicAlert.topic}")
    private String basicServicAlertTopic; //推送的Topic

    @Resource
    @Qualifier("externalKafkaTemplate")
    private KafkaTemplate<String, String> externalKafkaTemplate; //广州KafkaTemplate

    @Value("${cbssGdBehavioral.topic}")
    private String cbssGdBehavioralTopic; //推送的Topic

    /**
     * 从brs-bpi-message消费Web埋点数据
     */
    @KafkaListener(topics = {"brs-bpi-message"}, concurrency = "${kafka.tingyunKafka.concurrency}", containerFactory = "tingyunKafkaContainerFactory")
    public void handleData(ConsumerRecord<String, byte[]> record) {
        byte[] value = record.value();
        try {
            Action action = Action.parseFrom(value);
            Spe spe = action.getEvent().getSpe();
            ImmediateEvent immediateEvent = action.getImmediateEvent();

            /**
             * 弹窗事件
             */
            if (Objects.nonNull(immediateEvent) && 7 == action.getType().getNumber()) {
                //联通APP基础服务弹窗数据推送西咸省分生产区
                if (basicServicAlertBrowserId == action.getBrowserApplicationId()) {
                    JSONObject json = (JSONObject) Optional.ofNullable(JSONUtil.parse(immediateEvent.getContext())).orElse(new JSONObject());
                    json.put("appName", "联通APP基础服务"); //应用名称
                    json.put("subType", "immediate"); //事件类型
                    json.put("userId", action.getUserId()); //用户ID
                    json.put("countryId", action.getCountryId()); //国家
                    json.put("regionId", action.getRegionId()); //区域
                    json.put("cityId", action.getCityId()); //城市
                    json.put("clientIp", action.getClientIp()); //IP
                    json.put("carrierId", action.getCarrierId()); //运营商
                    json.put("name", immediateEvent.getName());
                    json.put("msg", immediateEvent.getMsg());
                    json.put("status", immediateEvent.getStatus());
                    json.put("timestamp", Long.valueOf(immediateEvent.getTime() / 1000L));
                    xxKafkaTemplate.send(basicServicAlertTopic, json.toJSONString(0));
                    log.info("basicServicAlert：" + json);
                }
            }

            /**
             * 埋点事件
             */
            if (Objects.nonNull(spe) && "spe".equals(action.getSubType()) && "auto".equals(spe.getType()) && StrUtil.isNotBlank(spe.getContext())) {
                JSONObject json = Optional.ofNullable(JSONUtil.parseObj(spe.getContext())).orElse(new JSONObject());
                //cBSS关于感知平台功能优化的需求
                String gdBegavioral = json.getStr("gdBegavioral", "0"); //获取埋点标识："gdBegavioral":"1"
                if ("1".equals(gdBegavioral)) {
                    json.put("key", spe.getKey());
                    json.put("ip", action.getClientIp());
                    json.put("time", Long.valueOf(action.getTimestamp() / 1000L));
                    externalKafkaTemplate.send(cbssGdBehavioralTopic, json.toJSONString(0));
                    log.info("cbssGdBehavioral：" + json);
                }
            }

        } catch (Exception e) {
            log.error("process message error：" + e.getMessage(), e);
        }
    }
}
