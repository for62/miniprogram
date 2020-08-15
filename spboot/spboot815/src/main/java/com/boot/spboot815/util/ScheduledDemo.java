package com.boot.spboot815.util;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ScheduledDemo {

    @Scheduled(cron = "0/3 * * * * ?")
    public void scheduledDemo(){
        System.out.println("定时器开始执行..."+new Date());
    }
}
