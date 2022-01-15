package com.spring.aop.jdk;

public class UserServiceImpl implements UserService{

    @Override
    public void run() {
        System.out.println("被代理类方法执行=======================");
    }
}
