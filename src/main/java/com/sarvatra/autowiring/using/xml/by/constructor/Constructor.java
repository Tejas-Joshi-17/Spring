package com.sarvatra.autowiring.using.xml.by.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Constructor {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("autowiring/UsingXML/Constructor.xml");
        // Set data using Constructor Injection in Dependent Class
        DependentClass dependentClass = (DependentClass) context.getBean("dependentCls");

        System.out.println(dependentClass);
        // DependentClass{name=Tejas Joshi, data=DependencyClass{age='22', address='Pune', designation='Software Developer'}}
    }
}
