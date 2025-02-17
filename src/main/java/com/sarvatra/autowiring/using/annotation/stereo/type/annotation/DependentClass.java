package com.sarvatra.autowiring.using.annotation.stereo.type.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component(value = "dependentClass")
public class DependentClass {

    @Value("Tejas Joshi")
    private String name;

    @Autowired
    private DependencyClass dependencyClass;

    @Value("#{mybestfriends}")
    private List<String> friends;

    @Override
    public String toString() {
        return "DependentClass{" +
                "name='" + name + '\'' +
                ", dependencyClass=" + dependencyClass +
                ", friends=" + friends +
                '}';
    }
}
