package com.unicom.config;

import lombok.extern.slf4j.Slf4j;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

@Slf4j
public class DateConfig {

    public String getYesterday(){

        // 获取当前时间
        LocalDateTime now = LocalDateTime.now();

        // 获取前一天的时间
        LocalDateTime yesterday = now.minus(1, ChronoUnit.DAYS);

        // 设置时间为00:00
        yesterday = yesterday.withHour(0).withMinute(0).withSecond(0).withNano(0);

        // 格式化日期时间
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String formattedYesterday = yesterday.format(formatter);
        // 输出结果
        log.info(formattedYesterday);
        log.info(formattedYesterday.toString());
        return formattedYesterday.toString();
    }
}
