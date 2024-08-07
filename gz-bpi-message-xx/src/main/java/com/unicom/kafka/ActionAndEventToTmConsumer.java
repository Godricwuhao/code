package com.unicom.kafka;

import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.unicom.bean.Action;
import com.unicom.bean.ImmediateEvent;
import com.unicom.bean.Spe;
import com.unicom.utils.CbssUtils;
import com.unicom.utils.ScriptSupport;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * 广州BPI数据（弹窗事件、自定义埋点）推送天明平台进行分析
 *
 * @author chenfl
 */
@Slf4j
@Component
public class ActionAndEventToTmConsumer {

    @Value("${gzBpiServic.cbssId}")
    private int gzBpiServicBrowserId; //cBSS应用ID
    @Value("${gzBpiServic.msgRegex}")
    private String cbssAlertMsgRegex; //msg清洗脚本

    @Resource
    @Qualifier("xxKafkaTemplate")
    private KafkaTemplate<String, String> xxKafkaTemplate; //西咸KafkaTemplate
    @Value("${gzBpiServic.topic}")
    private String gzBpiServicTopic; //推送的Topic

    @KafkaListener(topics = {"brs-bpi-message"}, concurrency = "${kafka.tingyunGzKafka.concurrency}", containerFactory = "tingyunGzKafkaContainerFactory")
    public void handleData(ConsumerRecord<String, byte[]> record) {
        try {
            byte[] value = record.value();
            Action action = Action.parseFrom(value);
            Spe spe = action.getEvent().getSpe();
            ImmediateEvent immediateEvent = action.getImmediateEvent();

            /**
             * 弹窗事件(newEvent)
             */
            if (Objects.nonNull(immediateEvent) && 7 == action.getType().getNumber() && StrUtil.isNotBlank(immediateEvent.getContext())) {
                try {
                    JSONObject properties = (JSONObject) Optional.ofNullable(JSONUtil.parse(immediateEvent.getContext())).orElse(new JSONObject());
                    properties.put("browserId", action.getBrowserApplicationId()); //应用ID，必须
                    properties.put("name", immediateEvent.getName()); //弹窗名称，必须
                    properties.put("msg", immediateEvent.getMsg()); //弹窗内容，必须
                    properties.put("status", immediateEvent.getStatus()); //弹窗状态，必须
                    if (gzBpiServicBrowserId == action.getBrowserApplicationId()) { //针对cBSS应用需要处理一些字段
                        properties.put("pCode", CbssUtils.getParamValue(action.getRequestUrl(), "LOGIN_PROVINCE_CODE")); //从页面URL中解析省编码
                        properties.put("eparchyCode", CbssUtils.getParamValue(action.getRequestUrl(), "eparchyCode")); //从页面URL中解析市编码
                        properties.put("service", CbssUtils.getParamValue(action.getRequestUrl(), "service")); //从页面URL中解析service
                        properties.put("msgContext", ScriptSupport.replaceMsg(immediateEvent.getMsg(), cbssAlertMsgRegex)); //弹窗内容，通过清洗msg获取
                    }
                    properties.put("$app_index", 811); //天明系统中newEvent应用ID，必须（对应Token：f1be9716385178d7c4e9f8c990d86f21）
                    properties.put("$time", action.getTimestamp());
                    properties.put("$mp_lib", "html5");
                    properties.put("$lib_version", "2.1.4_chinaunicom");
                    properties.put("$os", action.getSystem());
                    properties.put("$os_version", "");
                    properties.put("$browser_name", action.getWebBrowser());
                    properties.put("$browser_version", action.getWebBrowserVersion());
                    properties.put("$screen_width", CbssUtils.screenWidth(action.getResolution()));
                    properties.put("$screen_height", CbssUtils.screenHeight(action.getResolution()));
                    properties.put("$user_agent", action.getUa());
                    properties.put("$language", "zh-CN");
                    properties.put("$timezone_offset", "");
                    properties.put("$screen_name", action.getRequestUrl());
                    properties.put("$screen_title", "");
                    properties.put("$url", action.getRequestUrl());
                    properties.put("$url_path", action.getUri());
                    properties.put("$url_host", action.getHost());
                    properties.put("$url_query", "");
                    properties.put("$referrer", action.getRequestUrl());
                    properties.put("$referrer_host", action.getHost());
                    properties.put("$referrer_path", action.getUri());
                    properties.put("$referrer_query", "");
                    properties.put("$app_version", "2.1.4");
                    properties.put("$distinct_id", "");
                    properties.put("$user_id", action.getUserId()); //用户ID，必须
                    properties.put("$is_first_day", true);

                    JSONObject mpMetadata = new JSONObject();
                    mpMetadata.put("$mp_session_id", action.getSessionId());
                    mpMetadata.put("$mp_session_start_ms", action.getAgentUploadTime());
                    mpMetadata.put("$mp_session_end_ms", 0);

                    JSONObject json = new JSONObject();
                    json.put("event", "newEvent"); //事件名称，必须（统一为：newEvent）
                    json.put("properties", properties);
                    json.put("$mp_metadata", mpMetadata);
                    json.put("$_ap_platform", "h5");
                    json.put("$ip", action.getClientIp()); //客户端ID，必须

                    List<JSONObject> list = new ArrayList<>();
                    list.add(json);

                    JSONObject event = new JSONObject();
                    event.put("e", list);

                    xxKafkaTemplate.send(gzBpiServicTopic, event.toJSONString(0));

                } catch (Exception e) {
                    log.error("广州弹窗事件推送天明平台进行分析：" + e.getMessage(), e);
                }
            }

            /**
             * 自定义埋点(newAction)
             */
            if (Objects.nonNull(spe) && "spe".equals(action.getSubType()) && "auto".equals(spe.getType()) && StrUtil.isNotBlank(spe.getContext())) {
                try {
                    JSONObject properties = (JSONObject) Optional.ofNullable(JSONUtil.parseObj(spe.getContext())).orElse(new JSONObject());
                    properties.put("browserId", action.getBrowserApplicationId()); //应用ID，必须
                    properties.put("oprtName", spe.getKey()); //操作名称，必须
                    if (gzBpiServicBrowserId == action.getBrowserApplicationId()) { //针对cBSS应用需要处理一些字段
                        properties.put("pCode", CbssUtils.getParamValue(action.getRequestUrl(), "LOGIN_PROVINCE_CODE")); //从页面URL中解析省编码
                        properties.put("eparchyCode", CbssUtils.getParamValue(action.getRequestUrl(), "eparchyCode")); //从页面URL中解析市编码
                        properties.put("service", CbssUtils.getParamValue(action.getRequestUrl(), "service")); //从页面URL中解析service
                    }
                    properties.put("$app_index", 801); //天明系统中newAction应用ID，必须（对应Token：97e17ff8c4bed48a70a254e7e00475fa）
                    properties.put("$time", action.getTimestamp());
                    properties.put("$mp_lib", "html5");
                    properties.put("$lib_version", "2.1.4_chinaunicom");
                    properties.put("$os", action.getSystem());
                    properties.put("$os_version", "");
                    properties.put("$browser_name", action.getWebBrowser());
                    properties.put("$browser_version", action.getWebBrowserVersion());
                    properties.put("$screen_width", CbssUtils.screenWidth(action.getResolution()));
                    properties.put("$screen_height", CbssUtils.screenHeight(action.getResolution()));
                    properties.put("$user_agent", action.getUa());
                    properties.put("$language", "zh-CN");
                    properties.put("$timezone_offset", "");
                    properties.put("$screen_name", action.getRequestUrl());
                    properties.put("$screen_title", "");
                    properties.put("$url", action.getRequestUrl());
                    properties.put("$url_path", action.getUri());
                    properties.put("$url_host", action.getHost());
                    properties.put("$url_query", "");
                    properties.put("$referrer", action.getRequestUrl());
                    properties.put("$referrer_host", action.getHost());
                    properties.put("$referrer_path", action.getUri());
                    properties.put("$referrer_query", "");
                    properties.put("$app_version", "2.1.4");
                    properties.put("$distinct_id", "");
                    properties.put("$user_id", action.getUserId()); //用户ID，必须
                    properties.put("$is_first_day", true);

                    JSONObject mpMetadata = new JSONObject();
                    mpMetadata.put("$mp_session_id", action.getSessionId());
                    mpMetadata.put("$mp_session_start_ms", action.getAgentUploadTime());
                    mpMetadata.put("$mp_session_end_ms", 0);

                    JSONObject json = new JSONObject();
                    json.put("event", "newAction"); //事件名称，必须（统一为：newAction）
                    json.put("properties", properties);
                    json.put("$mp_metadata", mpMetadata);
                    json.put("$_ap_platform", "h5");
                    json.put("$ip", action.getClientIp()); //客户端ID，必须

                    List<JSONObject> list = new ArrayList<>();
                    list.add(json);

                    JSONObject event = new JSONObject();
                    event.put("e", list);
                    if (gzBpiServicBrowserId == action.getBrowserApplicationId()){
                        xxKafkaTemplate.send(gzBpiServicTopic, event.toJSONString(0));
                    }
                } catch (Exception e) {
                    log.error("广州自定义埋点推送天明平台进行分析：" + e.getMessage(), e);
                }
            }
        } catch (Exception e) {
            log.error("process message error：" + e.getMessage(), e);
        }
    }
}
