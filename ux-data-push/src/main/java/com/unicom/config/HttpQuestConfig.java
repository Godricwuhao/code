//package com.unicom.config;
//
//import lombok.extern.slf4j.Slf4j;
//import org.apache.http.Consts;
//import org.apache.http.client.entity.UrlEncodedFormEntity;
//import org.apache.http.message.BasicNameValuePair;
//import org.apache.http.util.EntityUtils;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Component;
//
//@Component
//@Slf4j
//@Configuration
//public class HttpQuestConfig {
//
//    @Value("${information.token}")
//    String token;
//    @Value("${information.url}")
//    String url;
//
//    @Bean
//    public String concatUrl() {
//        log.info("token=" + this.token);
//        log.info("url=" + this.url);
//        if (this.url == null) {
//            log.error("URL为空，无法拼接");
//            return null;
//        }
//        String url = null;
//        List<BasicNameValuePair> list = new ArrayList<BasicNameValuePair>();
//        list.add(new BasicNameValuePair("timePeriod", "1440"));
//        list.add(new BasicNameValuePair("endTime", "2024-06-28 15:14"));
//        list.add(new BasicNameValuePair("lang", "zh_CN"));
//        //转化参数
//        log.info("请求域名：" + this.url);
//        String params = null;
//        try {
//            params = EntityUtils.toString(new UrlEncodedFormEntity(list, Consts.UTF_8));
//        } catch (
//                IOException e) {
//            e.printStackTrace();
//        }
//        //判断请求接口是否为空，如果为空则抛出异常
//        if (params != null) {
//            url = this.url + "?" + params;
//            log.info("请求地址：" + url);
//        } else {
//            log.error("参数为空，无法拼接URL");
//        }
//        return url;
//    }
//
//    public String getToken(){
//        return token;
//    }
//}
