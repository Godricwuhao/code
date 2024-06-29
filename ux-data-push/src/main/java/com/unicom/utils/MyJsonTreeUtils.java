package com.unicom.utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class MyJsonTreeUtils {

    public String jsonParser(String value){
        String [] arry = {"name","uxScore","pageLoad","firstPaint","firstScreen","domReady","operationTime","operationAvailability","jsErrorRate"};
        String newJsonString = null;
        // 创建ObjectMapper实例
        ObjectMapper mapper = new ObjectMapper();
        try {
            // 将JSON字符串解析为JsonNode对象
            JsonNode rootNode = mapper.readTree(value);

            // 获取嵌套的JSON对象
            JsonNode personNode = rootNode.path("data");
            JsonNode addressNode = personNode.path("list");

            List<JSONObject> list = new ArrayList<>();
 //           ArrayNode dataArray = mapper.createArrayNode();
            if (addressNode.isArray()) {
                for (JsonNode listItem : addressNode) {
                    JSONObject newJson = new JSONObject();
                    for(int n=0;n<arry.length;n++){
                        log.debug(arry[n]);
                        newJson.put(arry[n]+": ", listItem.path(arry[n]).asText());
                        log.debug(arry[n]+": "+listItem.path(arry[n]).asText());
                    }
                    list.add(newJson);
                }
            }
            // 输出新的JSON字符串
            newJsonString = list.toString();
            log.debug("处理后数据: " + newJsonString);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return newJsonString;
    }
}
