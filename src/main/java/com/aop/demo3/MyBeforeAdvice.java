package com.aop.demo3;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;


//会对目标类所有方法进行增强
public class MyBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("前置增强===================");
    }
}
