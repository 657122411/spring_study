package com.tjh.demo3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
* Bean作用范围的测试
*/
public class SpringDemo3 {
    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person p1 = (Person)applicationContext.getBean("person");
        Person p2 = (Person)applicationContext.getBean("person");

        //地址是否相同判断同一对象，单例模式
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1==p2);
    }

    @Test
    public void test2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Man man1 = (Man)applicationContext.getBean("man");

        man1.run();

        ((ClassPathXmlApplicationContext) applicationContext).close();

    }

    @Test
    public void test3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");

        userDao.add();
        userDao.delete();
        userDao.find();
        userDao.find();
    }
}
