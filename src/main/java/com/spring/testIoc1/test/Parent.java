package com.spring.testIoc1.test;

import java.util.Date;

public abstract class Parent {

    protected String name;
    protected Date  date;
    protected void pack(Parent p){
        p.name = "52554";
        p.date = new Date();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
