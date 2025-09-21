package com.sarvatra.constructor.injection.primitive.datatype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("ConstructorInjection/PrimitiveDatatype.xml");
        // Set Data using constructor Injection
        // Set Data using constructor Injection

        Student student1 = (Student) context.getBean("student1");
        Student student2 = (Student) context.getBean("student2");

        if (logger.isInfoEnabled()) {
            logger.info(student1.toString());   // Student{studentId=1, studentName='Tejas Joshi', studentAddress='USA'}
            logger.info(student2.toString());   // Student{studentId=2, studentName='Sachin Tendulkar', studentAddress='Mumbai'}
        }
    }
}
