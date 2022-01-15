package com.spring.testIoc1.test;

import com.spring.testIoc1.Model.Person;
import com.spring.testIoc1.ioc.bean.Emp;
import com.spring.testIoc1.ioc.bean.Orders;
import com.spring.testIoc1.ioc.service.UserService;
import org.aspectj.weaver.ast.Or;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {

    public static void main(String[] args) {

//        method();
//        method2();
        method3();
    }

    public static void methodb() {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        method0();
        userService.add();
    }

    public static void method0() {
        System.out.println("==========================");
    }

    public static void method(){
        //内部bean测试方法
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("bean3.xml");
        Emp emp = applicationContext.getBean("emp", Emp.class);
        Emp emp2 = applicationContext.getBean("emp", Emp.class);
        System.out.println("判断spring创建的对象是否是单例---------------------");
        System.out.println(emp.hashCode());
        System.out.println(emp2.hashCode());
        System.out.println(emp2==emp);
        System.out.println(emp.toString());
        System.out.println(emp.getDept().toString());
    }
    public static void method2(){
        //内部bean测试方法
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("bean4.xml");
        Person emp = applicationContext.getBean("myBean", Person.class);
        Person emp2 = applicationContext.getBean("myBean", Person.class);
        System.out.println("========================================");
        System.out.println(emp.hashCode());
        System.out.println(emp2.hashCode());
        System.out.println(emp==emp2);
        System.out.println(emp.toString());
    }

    public static void method3(){
        //内部bean测试方法
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("bean5.xml");
        Orders emp = applicationContext.getBean("orders", Orders.class);
        System.out.println("第四步 获取创建bean实例对象");
        System.out.println(emp);

        //手动让bean实例销毁
        ((ClassPathXmlApplicationContext)applicationContext).close();
    }


}
