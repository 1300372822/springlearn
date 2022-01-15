package com.spring.testIoc1.test;

//采用模板模式管理事务  开启，执行，提交，回滚
//解析json为list，使用策略模式解析json串
public abstract class Transanction {
     private void beginConnection(){
     //开启事务管理器
     };
     private void commit(){

     };
    abstract void save();
    public final void execute(){
        beginConnection();
        save();
        commit();
    }
}
