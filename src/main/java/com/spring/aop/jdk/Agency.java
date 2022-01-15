package com.spring.aop.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 创建代理类
 */
public class Agency implements InvocationHandler {
    private  UserService target; //目标对象

    public Agency(UserService target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
      //proxy 代理方法被调用的实例
        System.out.println("方法触发了");
        Object invoke = method.invoke(target, args);
        System.out.println("执行完毕了");
        return invoke;
    }
}
