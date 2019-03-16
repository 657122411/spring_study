package com.tjh.demo2;


//Bean2的静态工厂
public class Bean2Factory {

    //静态方法
    public static Bean2 createBean2(){
        System.out.println("Bean2Factory的方法已经执行。。。");
        return new Bean2();
    }
}
