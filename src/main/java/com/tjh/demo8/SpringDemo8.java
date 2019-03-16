package com.tjh.demo8;

import com.tjh.demo4.Product;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo8 {
    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext2.xml");
        ProductService ps =(ProductService)applicationContext.getBean("productservice");

        ps.save();
    }
}
