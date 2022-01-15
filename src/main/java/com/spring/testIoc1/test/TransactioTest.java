package com.spring.testIoc1.test;

public class TransactioTest {

    public static void saveSomthing(Transanction transanction ){
        transanction.execute();
    }
    public static void main(String[] args) {
        saveSomthing( new Transanction(){
            @Override
            void save() {
                //具体item操作
            }
        });

    }
}
