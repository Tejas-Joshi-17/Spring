package com.sarvatra.autowiring.using.xml.by.constructor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DependencyClass {
    private String age;
    private String address;
    private String designation;
    private static final Logger logger = LoggerFactory.getLogger(DependencyClass.class);
    
    public void setAge(String age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public DependencyClass(String age, String address, String designation) {
        logger.info("Set data using Constructor Injection in Dependency Class");
        this.age = age;
        this.address = address;
        this.designation = designation;
    }

    public DependencyClass() {
    }

    @Override
    public String toString() {
        return "DependencyClass{" +
                "age='" + age + '\'' +
                ", address='" + address + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }

}