package com.example.designpattern.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author xianpeng.xia
 * on 2022/1/24 9:34 下午
 */

@Component
public class SpringContextUtil implements ApplicationContextAware {

    private static ApplicationContext applicationContextSpring;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringContextUtil.applicationContextSpring = applicationContext;
    }

    public static Object getBeanByName(String name) throws BeansException {
        return applicationContextSpring.getBean(name);
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContextSpring;
    }

    /**
     * 根据class类型获取bean,
     * 当有继承或者接口(多个实现类)getBean(class)会报错
     * 所以通过class name获取唯一的bean
     */
    public static <T> T getSingleBeanByType(Class<T> clazz) throws Exception {
        return applicationContextSpring.getBean(clazz);
    }


}
