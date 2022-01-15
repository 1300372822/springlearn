package com.spring.testIoc1.ioc;

public class User {

    private String username;

    public User() {
    }

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void add(){
        System.out.println("add-----------------");
    }
}
