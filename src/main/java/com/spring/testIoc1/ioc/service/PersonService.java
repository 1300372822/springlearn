package com.spring.testIoc1.ioc.service;

import com.spring.testIoc1.ioc.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

//@Component(value = "personService")  //<bean id="personService" class=" ">
@Service
public class PersonService {

    @Value(value = "abc")
    private String pname;
    //定义dao类型属性
//    @Autowired
//    @Qualifier(value = "personDaoImpl") 根据名称注入
//    @Resource  //按照类型注入
    @Resource(name = "personDaoImpl") //根据名称注入
    private PersonDao personDao;
    public void add(){
        System.out.println("service add ----------------------  "+pname);
        personDao.add();
    }
}
