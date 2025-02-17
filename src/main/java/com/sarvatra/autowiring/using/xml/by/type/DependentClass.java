package com.sarvatra.autowiring.using.xml.by.type;

public class DependentClass {
    private String name;
    private DependencyClass data;

    public void setName(String name) {
        System.out.println("Set Name using setter Injection");
        this.name = name;
    }

    public void setData(DependencyClass data) {
        System.out.println("Set data using setter Injection");
        this.data = data;
    }

    public DependentClass() {
    }

    public DependentClass(String name, DependencyClass data) {
//        this.name = name;
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
