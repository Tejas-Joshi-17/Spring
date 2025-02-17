// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

package com.sarvatra.autowiring.using.annotation.autowired.constructor.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjection {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("autowiring/UsingAnnotation/autowiring/ConstructorInjection.xml");
        // Setting Data of Dependency Class using Constructor Injection
        // Setting Values using Constructor Injection
        DependentClass dependentClass = (DependentClass) context.getBean("dependentCls");

        System.out.println(dependentClass);
        // DependentClass{name=Tejas Joshi, data=DependencyClass{age='22', address='Pune', designation='Software Developer'}}
    }
}

// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------