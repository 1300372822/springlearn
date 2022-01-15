package com.spring.testIoc1.Model;

public class Child extends AbsPerson{

    public void getStr1() {
        this.getMe();
//        this.getStr();
    }

    protected void getStr() {
        System.out.println("这是子类Child的方法");
    }
}
