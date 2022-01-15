package com.spring.testIoc1.test;

import com.spring.testIoc1.Model.Person;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * Ioc容器测试
 */
public class Test {

    public static void main(String[] args) {
        ClassPathResource resource = new ClassPathResource("application.xml");
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(resource);
        factory.getBean("");
        Person bean = (Person) factory.getBean("person");
//        Person bean = factory.getBean(Person.class);
        System.out.println(bean.getName());
    }
}
