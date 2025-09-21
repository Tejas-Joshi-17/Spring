// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

package com.sarvatra.autowiring.using.annotation.autowired.setter.injection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjection {
    private static final Logger logger = LoggerFactory.getLogger(SetterInjection.class);

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("autowiring/UsingAnnotation/autowiring/SetterInjection.xml");
        // Set Age using setterInjection
        // Set Address using setterInjection
        // Set Designation using setterInjection
        // Set data using setter Injection
        // Set Name using setter Injection
        DependentClass dependentClass = (DependentClass) context.getBean("dependentCls");

        if (logger.isInfoEnabled())
            logger.info(dependentClass.toString());
        // DependentClass{name=Tejas Joshi, data=DependencyClass{age='22', address='Pune', designation='Software Developer'}}
    }
}

// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------