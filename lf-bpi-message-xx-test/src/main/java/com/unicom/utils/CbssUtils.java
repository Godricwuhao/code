package com.unicom.utils;

import cn.hutool.core.util.StrUtil;

import java.net.URL;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

/**
 * cBSS工具类
 */
public class CbssUtils {


    /**
     * 通过action参数解析屏幕宽度
     *
     * @return
     */
    public static String screenWidth(String resolution) {
        try {
            if (StrUtil.isBlank(resolution)) {
                return "";
            }
            String[] parts = resolution.split("x");
            return parts[0];
        } catch (Exception e) {
            return "";
        }
    }

    /**
     * 通过action参数解析屏幕高度
     *
     * @return
     */
    public static String screenHeight(String resolution) {
        try {
            if (StrUtil.isBlank(resolution)) {
                return "";
            }
            String[] parts = resolution.split("x");
            return parts[1];
        } catch (Exception e) {
            return "";
        }
    }

    /**
     * 通过页面url获取某个参数值
     *
     * @param urlStr    页面地址
     * @param paramName 参数Key
     * @return
     */
    public static String getParamValue(String urlStr, String paramName) {
        try {
            URL url = new URL(urlStr);
            String query = url.getQuery(); // 获取查询字符串
            String[] params = query.split("&"); // 分割查询参数
            Map<String, String> paramMap = new HashMap<>();
            for (String param : params) {
                String[] keyValue = param.split("=");
                if (keyValue.length > 1) {
                    paramMap.put(keyValue[0], keyValue[1]);
                }
            }
            // 从Map中获取参数值
            String value = paramMap.get(paramName);
            if (value != null) {
                return URLDecoder.decode(value, "UTF-8");
            }
        } catch (Exception e) {
            return "";
        }
        return "";
    }
}
