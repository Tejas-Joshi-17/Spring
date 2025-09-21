package com.sarvatra.autowiring.using.xml.by.type;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ByType {
    private static final Logger logger = LoggerFactory.getLogger(ByType.class);

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("autowiring/UsingXML/byType.xml");
        // Set Name using setter Injection
        // Set data using setter Injection
        DependentClass dependentClass = (DependentClass) context.getBean("dependentCls");

        if (logger.isInfoEnabled())
            logger.info(dependentClass.toString());
        // DependentClass{name=Tejas Joshi, data=DependencyClass{age='22', address='Pune', designation='Software Developer'}}
    }
}
