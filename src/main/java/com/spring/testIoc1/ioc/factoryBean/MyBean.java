package com.spring.testIoc1.ioc.factoryBean;

import com.spring.testIoc1.Model.Person;
import org.springframework.beans.factory.FactoryBean;

public class MyBean implements FactoryBean<Person>{


    @Override
    public Person getObject() throws Exception {
        Person person = new Person();
        person.setName("zhansgan");
        return person;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
