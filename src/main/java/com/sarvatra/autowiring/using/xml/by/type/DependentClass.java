package com.sarvatra.autowiring.using.xml.by.type;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DependentClass {
    private String name;
    private DependencyClass data;
    private static final Logger logger = LoggerFactory.getLogger(DependentClass.class);

    public void setName(String name) {
        logger.info("Set Name using setter Injection");
        this.name = name;
    }

    public void setData(DependencyClass data) {
        logger.info("Set data using setter Injection");
        this.data = data;
    }

    public DependentClass() {
    }

    public DependentClass(String name, DependencyClass data) {
        // this.name = name;
        this.data = data;
    }

    @Override
    public String toString() {
        return "DependentClass{" +
                "name=" + name +
                ", data=" + data +
                '}';
    }

}