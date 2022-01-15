package com.spring.testIoc1.test;

import com.spring.testIoc1.Model.Child;

public class Test3 {

    public static void main(String[] args) {
        ChildA a = new ChildA();
        a.setAge(10);
        a.pack(a);
        ChildB b = new ChildB();
        String cc = b.name;
        b.pack(b);
        System.out.println(b);


         new NomousService() {
            public void aaa() {
                System.out.println("dhadhashdsahiodsa");
            }
        }.aaa();

         NomousService service = () ->  System.out.println("lamd表达式");
         service.aaa();
    }
}
