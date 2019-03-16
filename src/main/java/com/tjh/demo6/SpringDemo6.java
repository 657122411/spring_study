package com.tjh.demo6;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo6 {
    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext2.xml");

        UserService userService = (UserService)applicationContext.getBean("userService");
        String s = userService.sayHello("demo6");
        System.out.println(s);
    }

    @Test
    public void test2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext2.xml");

        UserService userService = (UserService)applicationContext.getBean("userService");
        userService.eat();
    }

    @Test
    public void test3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext2.xml");

        UserService userService = (UserService)applicationContext.getBean("userService");
        userService.save();
    }
}
