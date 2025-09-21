package com.sarvatra.autowiring.using.annotation.bean.scope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScope {
    private static final Logger logger = LoggerFactory.getLogger(BeanScope.class);
    
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("autowiring/UsingAnnotation/BeanScope.xml");

        Singleton singleton1 = (Singleton) context.getBean("Singleton");
        Singleton singleton2 = (Singleton) context.getBean("Singleton");

        logger.info(String.valueOf(singleton1.hashCode()));          // 1578009262   <--- Every time Same
        logger.info(String.valueOf(singleton2.hashCode()));          // 1578009262

        Prototype prototype1 = (Prototype) context.getBean("Prototype");
        Prototype prototype2 = (Prototype) context.getBean("Prototype");

        logger.info(String.valueOf(prototype1.hashCode()));          // 1735507635   <--- Every time Different
        logger.info(String.valueOf(prototype2.hashCode()));          // 1362728240

    }
}
