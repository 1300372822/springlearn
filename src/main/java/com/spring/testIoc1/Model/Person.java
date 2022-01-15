package com.spring.testIoc1.Model;

import org.springframework.stereotype.Component;


public class Person {
    private String name;
    private int age;

    protected void getStr(){
        System.out.println("这是父类的方法");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
