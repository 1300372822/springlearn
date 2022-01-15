package com.spring.testIoc1.Model;

public class Users{
    public  Person createPerson1(){
        System.out.println("非静态工厂创建Person");
        return new Person();
    }
}