package com.spring.testIoc1.ioc.dao;

import org.springframework.stereotype.Repository;
//注解用来创建对象dao对象
@Repository
public class PersonDaoImpl implements PersonDao{


    @Override
    public void add() {
        System.out.println("dao add --------------------------");
    }
}
