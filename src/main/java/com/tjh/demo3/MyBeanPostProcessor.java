package com.tjh.demo3;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


//涉及到AOP
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("第五步：初始化前方法。");
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(final Object o, String s) throws BeansException {
        System.out.println("第八步：初始化后方法。");
        if(s.equals("userDao")){
            Object proxy = Proxy.newProxyInstance(o.getClass().getClassLoader(), o.getClass().getInterfaces(), new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    if(method.getName().equals("add")){
                        System.out.println("权限校验");
                        return method.invoke(o,args);
                    }
                    return method.invoke(o,args);
                }
            });
            return proxy;
        }
        return o;
    }
}
