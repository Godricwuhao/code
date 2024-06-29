package com.unicom.utils;

import com.unicom.config.DateConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import java.io.IOException;

import org.json.*;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Component
@Configuration

public class MyHttpClient {


    public String doGetString() {
        //获取昨天时间
        DateConfig date = new DateConfig();

        //定义请求地址和返回值
        String token = "c7024ad5ec7c096e53d35a1701fe01900dfa434d42352d78b157c99f7ded9f2664a0cb0d21ec8ec50f94e9101338a0afd636859fc1bae6bc0f7035962e919999";
        String url = "http://10.172.131.10:8080/browser-api/module/list?";
        String data = null;
        log.info("url：" + url);
        log.info("token：" + token);

        //设置并转化请求参数
        List<BasicNameValuePair> list = new ArrayList<BasicNameValuePair>();
        list.add(new BasicNameValuePair("timePeriod", "1440"));
        list.add(new BasicNameValuePair("endTime", date.getYesterday()));
        list.add(new BasicNameValuePair("lang", "zh_CN"));

        // 获得Http客户端
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        // 创建Get请求
        HttpGet httpGet = new HttpGet(url);
        httpGet.setHeader("Authorization",token);

        log.info("请求域名：" + url);
        String params = null;
        try {
            params = EntityUtils.toString(new UrlEncodedFormEntity(list, Consts.UTF_8));
        } catch (
                IOException e) {
            e.printStackTrace();
        }

        //判断请求接口是否为空，如果为空则抛出异常
        if (params != null) {
            url = url + params;
            log.info("请求地址：" + url);
        } else {
            log.error("参数为空，无法拼接URL");
        }

        // 响应模型
        CloseableHttpResponse response = null;
        try {
            // 由客户端执行(发送)Get请求
            response = httpClient.execute(httpGet);

            // 从响应模型中获取响应实体
            log.info("响应状态为:" + response.getStatusLine());
            HttpEntity responseEntity = response.getEntity();
            if (responseEntity != null) {
                log.info("响应内容长度为:" + responseEntity.getContentLength());
                //System.out.println("响应内容为:" + EntityUtils.toString(responseEntity));
                if(response.getStatusLine().getStatusCode() == 200){
                    data = EntityUtils.toString(responseEntity);
                }
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                // 释放资源
                httpClient.close();
                response.close();
            } catch (IOException e) { e.printStackTrace(); }
        }
        return data;
    }

    public JSONObject doGetJson() {
        JSONObject json = new org.json.JSONObject(doGetString());
        log.debug("MyHttpClient:"+json);
        return json;
    }

}
