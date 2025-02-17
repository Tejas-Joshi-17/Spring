// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

package com.sarvatra.autowiring.using.annotation.stereo.type.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StereoTypeAnnotation {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("autowiring/UsingAnnotation/StereoTypeAnnotation.xml");
        DependentClass dependentClass = (DependentClass) context.getBean("dependentClass");

        System.out.println(dependentClass);
        // DependentClass{name='Tejas Joshi', dependencyClass=DependencyClass{age='22', address='Japan', designation='Software Developer'}, friends=[Aman, Raman, Ankit, Rohit]}
    }
}

// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------