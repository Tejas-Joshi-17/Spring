package com.sarvatra.autowiring.using.annotation.qualifier.setter.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class DependentClass {

    private String name;
    private DependencyClass dependencyClass;

    public void setName(String name) {
        System.out.println("Set Name using setter Injection");
        this.name = name;
    }

    @Autowired
    @Qualifier(value = "data_1")          // <--- By Name of Bean
    public void setData(DependencyClass dependencyClass) {
        System.out.println("Set data using setter Injection");
        this.dependencyClass = dependencyClass;
    }

    public DependentClass() {
    }

    public DependentClass(String name, DependencyClass dependencyClass) {
        System.out.println("Setting Values using Constructor Injection");
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
