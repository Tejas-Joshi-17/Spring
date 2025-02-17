package com.sarvatra.autowiring.using.annotation.bean.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "Prototype")
@Scope("prototype")
public class Prototype {
    private int id;
    private String name;
}
