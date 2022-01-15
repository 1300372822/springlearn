package com.spring.testIoc1.Model;

public abstract class AbsPerson {
    protected abstract void getStr();

    protected void getMe(){
        this.getStr();
    }
}
