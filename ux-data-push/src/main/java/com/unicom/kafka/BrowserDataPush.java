package com.unicom.kafka;

import cn.hutool.json.JSONObject;
import com.unicom.utils.MyHttpClient;
import com.unicom.utils.MyJsonTreeUtils;
import com.unicom.utils.MyJsonUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import javax.annotation.Resource;

@Slf4j
@Configuration      //主要用于标记配置类，兼备Component的效果。
@EnableScheduling   //开启定时任务

public class BrowserDataPush {

    @Value("${topic.name}")
    private String topicName; //推送的Topic
    @Resource
    @Qualifier("xxKafkaTemplate")
    private KafkaTemplate<String, String> xxKafkaTemplate; //西咸KafkaTemplate
    private MyHttpClient myHttpClient = new MyHttpClient();
    private MyJsonUtils myJsonUtils = new MyJsonUtils();
    private MyJsonTreeUtils myJsonTreeUtils = new MyJsonTreeUtils();

    //@Scheduled(cron = "0/10 * * * * ?")
    @Scheduled(fixedRate = 100000)
    public void sendData()
    {
        try {
            JSONObject json = new JSONObject();
            xxKafkaTemplate.send(topicName, myJsonTreeUtils.jsonParser(myHttpClient.doGetString())).addCallback(success->{
                String topic = success.getRecordMetadata().topic();
                log.info("数据推送成功至topic:"+topic+"，推送内容："+myJsonTreeUtils.jsonParser(myHttpClient.doGetString()));
            }, failure->{
                log.info("数据推送失败"+failure.getMessage());
            });
        } catch (Exception e) {
            log.info("Web指标数据推送" + e.getMessage(), e);
        }
    }
}
