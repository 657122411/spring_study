package com.aop.demo1;

import org.junit.Test;

public class SpringDemo1 {
    @Test
    public void test1(){
        UserDao userDao = new UserDaoImpl();

        //普通方法
        userDao.add();//增加保存前做一下权限验证怎么办？
        userDao.delete();
        userDao.find();
        userDao.update();

        System.out.println("加入权限校验：");

        //答案：产生代理对象
        UserDao proxy = (UserDao)new MyJdkProxy(userDao).createProxy();
        proxy.add();
        proxy.delete();
        proxy.find();
        proxy.update();
    }
}
