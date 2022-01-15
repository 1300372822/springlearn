package com.springTest;


import com.spring.config.SpringConfig;
import com.spring.testIoc1.ioc.autowire.Emp;
import com.spring.testIoc1.ioc.bean.Orders;
import com.spring.testIoc1.ioc.service.PersonService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Proxy;

public class TestIoc {

    @Test
    public void test(){
        //内部bean测试方法
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("bean6.xml");
        Emp emp = applicationContext.getBean("emp", Emp.class);
        System.out.println(emp);

    }
    @Test
    public void test2(){
        //内部bean测试方法
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("bean8.xml");
        PersonService emp = applicationContext.getBean("personService", PersonService.class);
        System.out.println(emp);
        emp.add();

    }
    //测试配置类
    @Test
    public void test3(){
        //加载配置类
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        PersonService emp = applicationContext.getBean("personService", PersonService.class);
        System.out.println(emp);
        emp.add();
//        Proxy.newProxyInstance()
    }

}
