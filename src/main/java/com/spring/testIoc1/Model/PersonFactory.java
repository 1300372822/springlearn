package com.spring.testIoc1.Model;

public class PersonFactory {
    public static Person  createPerson(){
        System.out.println("静态工厂创建Person");
        return  new Person();
    }
}