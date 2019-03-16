package com.tjh.demo6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/*
* Spring的Bean管理的注解方式
*   传统方式需要去XML中配置<bean id="" class=""/>
* */
//@Component("userService")//功能等效于
@Service("userService")
public class UserService {
    public String sayHello(String name){
        return "hello"+name;
    }

    @Value("米饭")
    private String something;

/*    @Autowired
    @Qualifier("userDao")//强制按名称注入*/
    @Resource(name = "userDao")//等效于上两行
    private UserDao userDao;

    public void eat(){
        System.out.println("eat "+something);
    }

    public void save(){
        System.out.println("Service中的保存用户方法");
        userDao.save();
    }

}
