package com.aop.demo2;

import org.junit.Test;

public class SpringDemo2 {
    @Test
    public void test1(){
        ProductDao productDao = new ProductDao();

        productDao.add();
        productDao.delete();
        productDao.update();
        productDao.find();

        System.out.println("引入cglib");

        ProductDao proxy = (ProductDao) new MyCglibProxy(productDao).createProxy();
        proxy.add();
        proxy.delete();
        proxy.update();
        proxy.find();

    }
}
