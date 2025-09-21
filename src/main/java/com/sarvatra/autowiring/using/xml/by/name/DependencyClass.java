package com.sarvatra.autowiring.using.xml.by.name;

public class DependencyClass {
    private String age;
    private String address;
    private String designation;

    public void setAge(String age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public DependencyClass(String age, String address, String designation) {
        this.age = age;
        this.address = address;
        this.designation = designation;
    }

    public DependencyClass() {
    }

    @Override
    public String toString() {
        return "DependencyClass{" +
                "age='" + age + '\'' +
                ", address='" + address + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }

}