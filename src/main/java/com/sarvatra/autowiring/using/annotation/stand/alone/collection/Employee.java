package com.sarvatra.autowiring.using.annotation.stand.alone.collection;

import lombok.*;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@ToString
public class Employee {
    private String name;
    private List<String> friendsList;
    private Set<String> address;
    private Map<String, String> feesStructure;
}
