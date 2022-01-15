package com.spring.testIoc1.ioc.dao;

import org.springframework.stereotype.Repository;

@Repository
public class PersonDaoImpl2 implements PersonDao{
    @Override
    public void add() {
        System.out.println("dao2 add-----------------------");
    }
}
