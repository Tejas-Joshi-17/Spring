// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

package com.sarvatra.autowiring.using.annotation.qualifier.setter.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjection {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("autowiring/UsingAnnotation/qualifier/SetterInjection.xml");
        // Set Age using setterInjection
        // Set Address using setterInjection
        // Set Designation using setterInjection
        // Set data using setter Injection
        // Set Name using setter Injection
        DependentClass dependentClass = (DependentClass) context.getBean("dependentCls");

        System.out.println(dependentClass);
        // DependentClass{name=Tejas Joshi, data=DependencyClass{age='22', address='Pune', designation='Software Developer'}}
    }
}

// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------