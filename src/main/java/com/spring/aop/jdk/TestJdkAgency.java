package com.spring.aop.jdk;

import java.lang.reflect.Proxy;
import java.util.concurrent.ConcurrentHashMap;

public class TestJdkAgency {
    public static void main(String[] args) {
        //测试jdk动态代理
        UserService service = new UserServiceImpl();
        Agency agency = new Agency(service);
        ConcurrentHashMap map = new ConcurrentHashMap();

        map.put("","");
        //这里不能转换成一个实际的类，必须是接口类型
        UserService service1 = (UserService)Proxy.newProxyInstance(
                service.getClass().getClassLoader(),
                service.getClass().getInterfaces(),agency);

        service1.run();
    }
}
