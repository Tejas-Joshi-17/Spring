package com.sarvatra.constructor.injection.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("ConstructorInjection/Collection.xml");
        // Set Data using constructor Injection
        
        Employee employee = (Employee) context.getBean("Emp1");

        System.out.println(employee);
        // Employee{name='Aakash', phones = [8485835616, 9890651146, 9403531933, 99518738527, null], address = [Sambhajinagar, Pune, USA, Russia], courses = {C=3 Months, C++=6 Months, Java=6 Months}}

    }
}
