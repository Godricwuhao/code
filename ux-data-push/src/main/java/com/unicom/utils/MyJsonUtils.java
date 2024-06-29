package com.unicom.utils;

import java.util.ArrayList;
import java.util.List;
import org.json.*;

public class MyJsonUtils {

    public String transform(JSONObject targetJson){
        // 原始JSON数据列表
        List<JSONObject> dataList = new ArrayList<>();
        dataList.add(targetJson);

        // 创建新的JSON数组来存储结果
        List<JSONObject> resultJsonList = new ArrayList<>();

        // 遍历原始JSON数据列表
        for (JSONObject data : dataList) {
            // 创建新的JSON对象
            JSONObject resultJson = new JSONObject();
            // 添加指定的字段
            resultJson.put("name", data.get("name"));
            resultJson.put("uxScore", data.get("uxScore"));
            resultJson.put("slowpageRatio", data.get("slowpageRatio"));
            resultJson.put("pageLoad", data.get("pageLoad"));
            resultJson.put("firstPaint", data.get("firstPaint"));
            resultJson.put("domReady", data.get("domReady"));
            resultJson.put("operationTime", data.get("operationTime"));
            resultJson.put("operationAvailability", data.get("operationAvailability"));
            resultJson.put("jsErrorRate", data.get("jsErrorRate"));
            // 将新的JSON对象添加到结果列表中
            resultJsonList.add(resultJson);
        }

        for (JSONObject resultJson : resultJsonList) {
            System.out.println(resultJson.toString());
        }
        return resultJsonList.toString();
    }
}
