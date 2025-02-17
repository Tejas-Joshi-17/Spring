// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

package com.sarvatra.autowiring.using.annotation.qualifier.property.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Property {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("autowiring/UsingAnnotation/qualifier/Property.xml");
        // Set Age using setterInjection
        // Set Address using setterInjection
        // Set Designation using setterInjection
        // Set Name using setter Injection
        DependentClass dependentClass = (DependentClass) context.getBean("dependentCls");

        System.out.println(dependentClass);
        // DependentClass{name=Tejas Joshi, data=DependencyClass{age='22', address='Pune', designation='Software Developer'}}
    }
}

// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------