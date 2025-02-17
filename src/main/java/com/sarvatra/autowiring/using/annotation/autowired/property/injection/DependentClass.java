package com.sarvatra.autowiring.using.annotation.autowired.property.injection;

import org.springframework.beans.factory.annotation.Autowired;

public class DependentClass {

    private String name;

    @Autowired          // By Type of Bean
    private DependencyClass dependencyClass;

    public void setName(String name) {
        System.out.println("Set Name using setter Injection");
        this.name = name;
    }

    public void setData(DependencyClass data) {
        System.out.println("Set data using setter Injection");
        this.dependencyClass = data;
    }

    public DependentClass() {
    }

    public DependentClass(String name, DependencyClass data) {
        System.out.println("Setting Values using Constructor Injection");
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
