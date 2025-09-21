package com.sarvatra.autowiring.using.annotation.autowired.property.injection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DependencyClass {
    private String age;
    private String address;
    private String designation;
    private static final Logger logger = LoggerFactory.getLogger(DependencyClass.class);

    public void setAge(String age) {
        logger.info("Set Age using setterInjection");
        this.age = age;
    }

    public void setAddress(String address) {
        logger.info("Set Address using setterInjection");
        this.address = address;
    }

    public void setDesignation(String designation) {
        logger.info("Set Designation using setterInjection");
        this.designation = designation;
    }

    public DependencyClass(String age, String address, String designation) {
        logger.info("Setting Data of Dependency Class using Constructor Injection");
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