package com.sarvatra.autowiring.using.annotation.bean.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScope {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("autowiring/UsingAnnotation/BeanScope.xml");

        Singleton singleton1 = (Singleton) context.getBean("Singleton");
        Singleton singleton2 = (Singleton) context.getBean("Singleton");

        System.out.println(singleton1.hashCode());          // 1578009262   <--- Every time Same
        System.out.println(singleton2.hashCode());          // 1578009262

        Prototype prototype1 = (Prototype) context.getBean("Prototype");
        Prototype prototype2 = (Prototype) context.getBean("Prototype");

        System.out.println(prototype1.hashCode());          // 1735507635   <--- Every time Different
        System.out.println(prototype2.hashCode());          // 1362728240

    }
}
