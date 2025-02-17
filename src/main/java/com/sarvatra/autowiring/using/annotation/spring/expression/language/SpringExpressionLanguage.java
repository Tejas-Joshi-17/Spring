// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

package com.sarvatra.autowiring.using.annotation.spring.expression.language;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringExpressionLanguage {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowiring/UsingAnnotation/SpringExpressionLanguage.xml");

        Employee employee = (Employee) context.getBean("Employee");

        System.out.println("Id is :- " + employee.getId());                     // Id is :- 2
        System.out.println("Roll No. is :- " + employee.getRollNo());           // Roll No. is :- 33
        System.out.println("Standard is :- " + employee.getStandard());         // Standard is :- 88
        System.out.println("Square Root is :- " + employee.getNumber());        // Square Root is :- 4.795831523312719
        System.out.println("PI is :- " + employee.getPI());                     // PI is :- 3.141592653589793
        System.out.println("Designation is :- " + employee.getDesignation());   // Designation is :- Software Developer
        System.out.println("isActive is :- " + employee.isActive());            // isActive is :- true
        System.out.println("Friends is :- " + employee.getFriendsList());       // Friends is :- [Aman, Raman, Ankit, Rohit]
    }
}

// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
