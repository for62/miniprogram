package com.boot.spboot815.util;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

public class QuartDemoUtil{
    public static void main(String[] args) throws Exception{
        /**
         *  1、 创建Job对象，你要做什么事？
         */
        JobDetail jobDetail = JobBuilder.newJob(QuartzDemo.class).build();

        /**
         * 简单的Trigger触发时间，通过Quartz提供一个方法来完成简单的重复调用cron
         * Trigger：按照Cron的表达式来设定触发时间
         *  2、 创建Trigger对象，在什么时间做？
         */
        Trigger trigger = TriggerBuilder.newTrigger()
                .withSchedule(SimpleScheduleBuilder.repeatSecondlyForever()).build();

        /**
         *  3、 创建Schedule对象，在什么时间做什么事？
         */
        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
        scheduler.scheduleJob(jobDetail,trigger);
        scheduler.start();
    }
}
