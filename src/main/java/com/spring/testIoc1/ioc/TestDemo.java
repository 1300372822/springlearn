package com.spring.testIoc1.ioc;

import com.spring.testIoc1.Model.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {
    public static void main(String[] args) {
//        ApplicationContext applicationContext
//                = new ClassPathXmlApplicationContext("application.xml");
//        ApplicationContext加载配置文件时就会创建对象
//        BeanFactory加载配置文件时不会创建对象
//        ClassPathXmlApplicationContext 加载相对路径下的xml文件
//        FileSystemXmlApplicationContext 加载绝对路径下的xml文件

        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("application.xml");
        User u4 = (User)applicationContext.getBean("u4");
        Person pf = applicationContext.getBean("pf", Person.class);
        Book book = applicationContext.getBean("book", Book.class);
        System.out.println(pf.toString());
        System.out.println(book.toString());
        u4.add();
    }
}
