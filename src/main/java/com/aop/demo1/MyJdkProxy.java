package com.aop.demo1;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyJdkProxy implements InvocationHandler{
    private UserDao userDao;

    public MyJdkProxy(UserDao userDao){
        this.userDao = userDao;
    }

    //对于没有接口的业务类，无法使用JDK动态代理，可使用CGLIB(可为类创建子类)
    public Object createProxy(){
        Object proxy = Proxy.newProxyInstance(userDao.getClass().getClassLoader(),userDao.getClass().getInterfaces(),this);
        return proxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if("add".equals(method.getName()))//是向数据库增加内容就需要进行权限验证环节
        {
            System.out.println("权限校验");
            return method.invoke(userDao,args);

        }
        return method.invoke(userDao,args);
    }
}
