package com.spring.aop.aopAnnotation;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class PersonProxy {

    //后置通知
    @AfterReturning(value = "execution(* com.spring.aop.aopAnnotation.User.add(..))")
    public void afterReturing(){
        System.out.println("person after--------------------------");
    }
}
