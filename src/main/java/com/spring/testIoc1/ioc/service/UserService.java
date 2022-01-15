package com.spring.testIoc1.ioc.service;

import com.spring.testIoc1.ioc.dao.UserDao;
import com.spring.testIoc1.ioc.dao.UserDaoImpl;

public class UserService {
    //创建UserDao对象
    private UserDao dao ;

    public UserDao getDao() {
        return dao;
    }

    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    public void add(){
        System.out.println("service add ----------------------");
        dao.update();

    }
}
