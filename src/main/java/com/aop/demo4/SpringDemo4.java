package com.aop.demo4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext4.xml")
public class SpringDemo4 {

    //@Resource(name="customerDao")
    //实际应该注入下面
    @Resource(name="customerProxy")
    private CustomerDao customerDao;

    @Test
    public void test1(){
        customerDao.add();
        customerDao.delete();
        customerDao.update();
        customerDao.find();
    }


}
