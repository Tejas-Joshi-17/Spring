package com.sarvatra.constructor.injection.collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
    private String name;
    private List<String> phones;
    private Set<String> address;
    private Map<String, String> courses;
    private static final Logger logger = LoggerFactory.getLogger(Employee.class);

    public Employee() {
    }

    public Employee(String name, List<String> phones, Set<String> address, Map<String, String> courses) {
        logger.info("Set Data using constructor Injection");
        this.name = name;
        this.phones = phones;
        this.address = address;
        this.courses = courses;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", phones = " + phones +
                ", address = " + address +
                ", courses = " + courses +
                '}';
    }

}