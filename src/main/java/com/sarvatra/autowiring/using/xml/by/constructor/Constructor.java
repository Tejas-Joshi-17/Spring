package com.sarvatra.autowiring.using.xml.by.constructor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Constructor {
    private static final Logger logger = LoggerFactory.getLogger(Constructor.class);

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("autowiring/UsingXML/Constructor.xml");
        // Set data using Constructor Injection in Dependent Class
        DependentClass dependentClass = (DependentClass) context.getBean("dependentCls");

        if (logger.isInfoEnabled())
            logger.info(dependentClass.toString());
        // DependentClass{name=Tejas Joshi, data=DependencyClass{age='22', address='Pune', designation='Software Developer'}}
    }

}