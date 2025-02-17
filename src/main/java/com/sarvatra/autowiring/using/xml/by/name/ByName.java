package com.sarvatra.autowiring.using.xml.by.name;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ByName {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("autowiring/UsingXML/byName.xml");
        // Set Name using setter Injection
        // Set data using setter Injection
        DependentClass dependentClass = (DependentClass) context.getBean("dependentCls");

        System.out.println(dependentClass);
        // DependentClass{name=Tejas Joshi, data=DependencyClass{age='22', address='Pune', designation='Software Developer'}}
    }
}
