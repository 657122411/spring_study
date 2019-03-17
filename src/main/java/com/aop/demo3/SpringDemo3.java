package com.aop.demo3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext3.xml")
public class SpringDemo3 {

    //@Resource(name="studentDao")
    //为了增强改成下面
    @Resource(name="studentDaoProxy")
    private StudentDao studentDao;

    @Test
    public void test1(){
        studentDao.add();
        studentDao.detele();
        studentDao.find();
        studentDao.update();
    }

}
