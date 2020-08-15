package com.boot.spboot815.util;

import com.boot.spboot815.service.serviceImpl.TestQuartzConfig;
import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class QuartzDemo implements Job {
    @Autowired
    private TestQuartzConfig testQuartzConfig;
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("定时器生效...");
        this.testQuartzConfig.print();
    }
}
