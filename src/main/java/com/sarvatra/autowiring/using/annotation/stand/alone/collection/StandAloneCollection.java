// --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

package com.sarvatra.autowiring.using.annotation.stand.alone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StandAloneCollection {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("autowiring/UsingAnnotation/StandaloneCollection.xml");

        Employee emp1 = (Employee) context.getBean("Emp1");
        System.out.println(emp1);
        // Employee{name='Tejas Joshi', friendsList=[Aman, Raman, Ankit, Rohit], address=[London, Pune, Aucland, Sambhajinagar], feesStructure={Angular Framework=1000, Django Framework=5000, Spring Framework=8000}}

        System.out.println(emp1.getName());             // Tejas Joshi
        System.out.println(emp1.getAddress());          // [London, Pune, Aucland, Sambhajinagar]
        System.out.println(emp1.getFeesStructure());    // {Angular Framework=1000, Django Framework=5000, Spring Framework=8000}
        System.out.println(emp1.getFriendsList());      // [Aman, Raman, Ankit, Rohit]
    }
}

// --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------