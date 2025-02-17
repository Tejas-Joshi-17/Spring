package com.sarvatra.autowiring.using.annotation.qualifier.constructor.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class DependentClass {

    private String name;
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

    @Autowired
    // @Qualifier       // <--- By Name of Bean
    public DependentClass(String name, @Qualifier(value = "data_1") DependencyClass dependencyClass) {
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
