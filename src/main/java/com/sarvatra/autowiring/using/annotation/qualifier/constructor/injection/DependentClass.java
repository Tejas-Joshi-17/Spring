package com.sarvatra.autowiring.using.annotation.qualifier.constructor.injection;

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

    public void setData(DependencyClass data) {
        logger.info("Set data using setter Injection");
        this.dependencyClass = data;
    }

    public DependentClass() {
    }

    @Autowired
    // @Qualifier       // <--- By Name of Bean
    public DependentClass(String name, @Qualifier(value = "data_1") DependencyClass dependencyClass) {
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