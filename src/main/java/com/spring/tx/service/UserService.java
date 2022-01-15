package com.spring.tx.service;

import com.spring.tx.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.TimeUnit;

/**
 * propagation 事务的传播行为
 * isolation   事务的隔离级别
 * readOnly    是否只读  true只能查询
 * timeout     超时时间  事务需要在一定时间内进行提交，如果不提交进行回滚，默认值-1，秒计算
 * rollbackFor 回滚   设置出现那些异常进行回滚
 * noRollbackFor  不回滚  设置出现那些异常不进行回滚
 */
@Service
@Transactional(propagation= Propagation.NESTED,
        isolation = Isolation.READ_COMMITTED,
        readOnly = false,
        timeout = 33,
        rollbackFor ={},
        noRollbackFor = {})  //如果注解添加到类上面表示这个类所有方法都添加了事务
public class UserService {

    @Autowired
    private UserDao dao;

    //转账的方法
    //@Transactional //只是为方法添加了注解
    public void accountMoney(){
        //第一步，开启事务
//        try {
            //第二步，业务操作
            dao.addMoney();

//            int i = 10/0;
            dao.reduceMoney();
            //第三步，没有发生异常，提交事务
//        }catch (Exception e){
//            e.printStackTrace();
//            //第四步，出现异常，事务回滚
//        }



    }

}
