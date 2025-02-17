package com.sarvatra.autowiring.using.annotation.autowired.constructor.injection;

public class DependencyClass {
    private String age;
    private String address;
    private String designation;

    public void setAge(String age) {
        System.out.println("Set Age using setterInjection");
        this.age = age;
    }

    public void setAddress(String address) {
        System.out.println("Set Address using setterInjection");
        this.address = address;
    }

    public void setDesignation(String designation) {
        System.out.println("Set Designation using setterInjection");
        this.designation = designation;
    }

    public DependencyClass(String age, String address, String designation) {
        System.out.println("Setting Data of Dependency Class using Constructor Injection");
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
