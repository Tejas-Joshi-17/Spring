package com.sarvatra.constructor.injection.collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("ConstructorInjection/Collection.xml");
        // Set Data using constructor Injection
        
        Employee employee = (Employee) context.getBean("Emp1");

        if (logger.isInfoEnabled())
            logger.info(employee.toString());
        // Employee{name='Aakash', phones = [8485835616, 9890651146, 9403531933, 99518738527, null], address = [Sambhajinagar, Pune, USA, Russia], courses = {C=3 Months, C++=6 Months, Java=6 Months}}

    }
}
