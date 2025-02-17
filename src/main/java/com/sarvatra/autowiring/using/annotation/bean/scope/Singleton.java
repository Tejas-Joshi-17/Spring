package com.sarvatra.autowiring.using.annotation.bean.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "Singleton")
@Scope("singleton")
public class Singleton {
    private int id;
    private String name;
}
