// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

package com.sarvatra.autowiring.using.annotation.spring.expression.language;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringExpressionLanguage {
    private static final Logger logger = LoggerFactory.getLogger(SpringExpressionLanguage.class);

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("autowiring/UsingAnnotation/SpringExpressionLanguage.xml");

        Employee employee = context.getBean(Employee.class);

        logger.info("Id is :- {}", employee.getId());                     // Id is :- 2
        logger.info("Roll No. is :- {}", employee.getRollNo());           // Roll No. is :- 33
        logger.info("Standard is :- {}", employee.getStandard());         // Standard is :- 88
        logger.info("Square Root is :- {}", employee.getNumber());        // Square Root is :- 4.795831523312719
        logger.info("PI is :- {}", employee.getPI());                     // PI is :- 3.141592653589793
        logger.info("Designation is :- {}", employee.getDesignation());   // Designation is :- Software Developer
        logger.info("isActive is :- {}", employee.isActive());            // isActive is :- true
        logger.info("Friends is :- {}", employee.getFriendsList());       // Friends is :- [Aman, Raman, Ankit, Rohit]
    }
}


// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
