// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

package com.sarvatra.autowiring.using.annotation.autowired.property.injection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Property {
    private static final Logger logger = LoggerFactory.getLogger(Property.class);

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("autowiring/UsingAnnotation/autowiring/Property.xml");
        // Set Age using setterInjection
        // Set Address using setterInjection
        // Set Designation using setterInjection
        // Set Name using setter Injection
        DependentClass dependentClass = (DependentClass) context.getBean("dependentCls");

        if (logger.isInfoEnabled())
            logger.info(dependentClass.toString());
        // DependentClass{name=Tejas Joshi, data=DependencyClass{age='22', address='Pune', designation='Software Developer'}}
    }
}

// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------