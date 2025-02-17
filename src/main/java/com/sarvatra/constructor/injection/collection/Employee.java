package com.sarvatra.constructor.injection.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
    private String name;
    private List<String> phones;
    private Set<String> address;
    private Map<String, String> courses;

    public Employee() {
    }

    public Employee(String name, List<String> phones, Set<String> address, Map<String, String> courses) {
        System.out.println("Set Data using constructor Injection");
        this.name = name;
        this.phones = phones;
        this.address = address;
        this.courses = courses;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", phones = " + phones +
                ", address = " + address +
                ", courses = " + courses +
                '}';
    }
}
