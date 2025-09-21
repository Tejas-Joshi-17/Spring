// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

package com.sarvatra.autowiring.using.annotation.stereo.type.annotation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StereoTypeAnnotation {
    private static final Logger logger = LoggerFactory.getLogger(StereoTypeAnnotation.class);

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("autowiring/UsingAnnotation/StereoTypeAnnotation.xml");
        DependentClass dependentClass = (DependentClass) context.getBean("dependentClass");

        if (logger.isInfoEnabled())
            logger.info(dependentClass.toString());
        // DependentClass{name='Tejas Joshi', dependencyClass=DependencyClass{age='22', address='Japan', designation='Software Developer'}, friends=[Aman, Raman, Ankit, Rohit]}
    }
}

// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------