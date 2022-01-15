package com.spring.tx.test;

import com.spring.tx.config.TxConfig;
import com.spring.tx.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.PlatformTransactionManager;
import org.testng.annotations.Test;

import java.lang.management.PlatformLoggingMXBean;

public class TestAccount {

    @Test
    public void testAccount(){
        //ctrl+h 查看接口情况
        PlatformTransactionManager transactionManager;
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean7database.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    @Test
    public void testAccount2(){
        //ctrl+h 查看接口情况
        PlatformTransactionManager transactionManager;
        ApplicationContext context =
                new AnnotationConfigApplicationContext(TxConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }
}
