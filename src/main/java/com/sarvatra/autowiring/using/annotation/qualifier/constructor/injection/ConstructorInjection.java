// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

package com.sarvatra.autowiring.using.annotation.qualifier.constructor.injection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjection {
    private static final Logger logger = LoggerFactory.getLogger(ConstructorInjection.class);

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("autowiring/UsingAnnotation/qualifier/ConstructorInjection.xml");
        // Setting Data of Dependency Class using Constructor Injection
        // Setting Values using Constructor Injection
        DependentClass dependentClass = (DependentClass) context.getBean("dependentCls");

        if (logger.isInfoEnabled())
            logger.info(dependentClass.toString());
        // DependentClass{name=Tejas Joshi, data=DependencyClass{age='22', address='Pune', designation='Software Developer'}}
    }
}

// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------