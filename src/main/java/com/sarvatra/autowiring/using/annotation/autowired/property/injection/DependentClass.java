package com.sarvatra.autowiring.using.annotation.autowired.property.injection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class DependentClass {
    private static final Logger logger = LoggerFactory.getLogger(DependentClass.class);

    private String name;

    @Autowired          // By Type of Bean
    private DependencyClass dependencyClass;

    public void setName(String name) {
        logger.info("Set Name using setter Injection");
        this.name = name;
    }

    public void setData(DependencyClass data) {
        logger.info("Set data using setter Injection");
        this.dependencyClass = data;
    }

    public DependentClass() {
    }

    public DependentClass(String name, DependencyClass data) {
        logger.info("Setting Values using Constructor Injection");
        this.name = name;
        this.dependencyClass = data;
    }

    @Override
    public String toString() {
        return "DependentClass{" +
                "name=" + name +
                ", data=" + dependencyClass +
                '}';
    }

}