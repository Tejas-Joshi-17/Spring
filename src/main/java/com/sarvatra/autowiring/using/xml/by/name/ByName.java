package com.sarvatra.autowiring.using.xml.by.name;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ByName {
    private static final Logger logger = LoggerFactory.getLogger(ByName.class);

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("autowiring/UsingXML/byName.xml");
        // Set Name using setter Injection
        // Set data using setter Injection
        DependentClass dependentClass = (DependentClass) context.getBean("dependentCls");

        if (logger.isInfoEnabled())
            logger.info(dependentClass.toString());
        // DependentClass{name=Tejas Joshi, data=DependencyClass{age='22', address='Pune', designation='Software Developer'}}
    }
}
