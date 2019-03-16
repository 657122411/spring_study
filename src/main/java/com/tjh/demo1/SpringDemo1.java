package com.tjh.demo1;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo1 {

    @Test
//  传统方式
    public void demo1(){
//        UserService userService = new UserServiceImpl();
//        ((UserServiceImpl) userService).setName("李四");
//        userService.sayHello();
        UserServiceImpl userService = new UserServiceImpl();
        ((UserServiceImpl) userService).setName("李四");
        userService.sayHello();
    }

    @Test
//  spring方式
    public void demo2(){
        //创建Spring工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过工厂获得类的实例
        UserService userService= (UserService) applicationContext.getBean("userService");
        userService.sayHello();
    }

}
