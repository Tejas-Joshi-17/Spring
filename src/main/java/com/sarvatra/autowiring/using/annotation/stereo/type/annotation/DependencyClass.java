package com.sarvatra.autowiring.using.annotation.stereo.type.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "dependencyClass")
public class DependencyClass {

    @Value("22")
    private String age;

    @Value("Japan")
    private String address;

    @Value("Software Developer")
    private String designation;

    @Override
    public String toString() {
        return "DependencyClass{" +
                "age='" + age + '\'' +
                ", address='" + address + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }

}