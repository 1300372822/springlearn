package com.spring.testIoc1.ioc.dao;

public class UserDaoImpl implements UserDao{
    @Override
    public void update() {
        System.out.println("dao update----------------");
    }
}
