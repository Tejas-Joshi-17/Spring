package com.sarvatra.autowiring.using.annotation.qualifier.setter.injection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class DependentClass {

    private String name;
    private DependencyClass dependencyClass;
    private static final Logger logger = LoggerFactory.getLogger(DependentClass.class);

    public void setName(String name) {
        logger.info("Set Name using setter Injection");
        this.name = name;
    }

    @Autowired
    @Qualifier(value = "data_1")          // <--- By Name of Bean
    public void setData(DependencyClass dependencyClass) {
        logger.info("Set data using setter Injection");
        this.dependencyClass = dependencyClass;
    }

    public DependentClass() {
    }

    public DependentClass(String name, DependencyClass dependencyClass) {
        logger.info("Setting Values using Constructor Injection");
        this.name = name;
        this.dependencyClass = dependencyClass;
    }

    @Override
    public String toString() {
        return "DependentClass{" +
                "name=" + name +
                ", data=" + dependencyClass +
                '}';
    }

}