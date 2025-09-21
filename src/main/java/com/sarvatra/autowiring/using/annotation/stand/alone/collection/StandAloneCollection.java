// --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

package com.sarvatra.autowiring.using.annotation.stand.alone.collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StandAloneCollection {
    private static final Logger logger = LoggerFactory.getLogger(StandAloneCollection.class);
    
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("autowiring/UsingAnnotation/StandaloneCollection.xml");

        Employee emp1 = (Employee) context.getBean("Emp1");

        if (logger.isInfoEnabled()) {
            logger.info(emp1.toString());
            // Employee{name='Tejas Joshi', friendsList=[Aman, Raman, Ankit, Rohit], address=[London, Pune, Aucland, Sambhajinagar], feesStructure={Angular Framework=1000, Django Framework=5000, Spring Framework=8000}}

            logger.info(emp1.getName());                        // Tejas Joshi
            logger.info(emp1.getAddress().toString());          // [London, Pune, Aucland, Sambhajinagar]
            logger.info(emp1.getFeesStructure().toString());    // {Angular Framework=1000, Django Framework=5000, Spring Framework=8000}
            logger.info(emp1.getFriendsList().toString());      // [Aman, Raman, Ankit, Rohit]
        }
    }
}

// --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------