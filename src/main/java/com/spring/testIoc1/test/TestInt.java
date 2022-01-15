package com.spring.testIoc1.test;

import java.sql.DriverManager;
import java.sql.SQLException;

public class TestInt {
    public static void main(String[] args) {
        Integer a = new Integer(10);
        Integer b = new Integer(10);
        System.out.println();
        try {
            DriverManager.getConnection("");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
