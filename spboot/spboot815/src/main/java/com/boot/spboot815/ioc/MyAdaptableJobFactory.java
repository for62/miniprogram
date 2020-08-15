package com.boot.spboot815.ioc;

import org.quartz.spi.TriggerFiredBundle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.scheduling.quartz.AdaptableJobFactory;
import org.springframework.stereotype.Component;

/**
 * 将对象加入到spring的ioc容器中
 */
@Component("myAdaptableJobFactory")
public class MyAdaptableJobFactory extends AdaptableJobFactory {

    /**
     * AutowireCapableBeanFactory可以将一个对象添加到spring的IOC容器中，并完成对象注入
     */
    @Autowired
    private AutowireCapableBeanFactory autowireCapableBeanFactory;

    /**
     * 该方法需要将实例化的任务对象手动的添加到spring的IOC容器中并且完成对象的注入
     * @param bundle
     * @return
     * @throws Exception
     */
    @Override
    protected Object createJobInstance(TriggerFiredBundle bundle) throws Exception {
        Object jobInstance = super.createJobInstance(bundle);
        autowireCapableBeanFactory.autowireBean(jobInstance);
        return jobInstance;
    }
}
