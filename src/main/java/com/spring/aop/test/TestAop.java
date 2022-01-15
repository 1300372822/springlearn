package com.spring.aop.test;

import com.spring.aop.aopAnnotation.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

public class TestAop {

    @Test
    public void testAopAnnotation(){
        ApplicationContext context =
        new ClassPathXmlApplicationContext("beanaop1.xml");
        User user = context.getBean("user", User.class);
        user.add();

    }
}
