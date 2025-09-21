package com.sarvatra.autowiring.using.annotation.spring.expression.language;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@ToString
@Getter
@Setter
@Component(value = "Employee")
public class Employee {

    @Value("#{2}")
    private int id;                     // id = 33

    @Value("#{11+22}")
    private int rollNo;

    @Value("#{ T(java.lang.Math).sqrt(23) }")
    private double number;

    @Value("#{ T(java.lang.Math).PI }")
    private double PI;

    @Value("#{new java.lang.String('Software Developer')}")
    private String designation;

    @Value("#{8>3}")
    private boolean isActive;

    @Value("#{8>6?88:66}")
    private int standard;               // standard = 88

    @Value("#{mybestfriends}")
    private List<String> friendsList;

}
