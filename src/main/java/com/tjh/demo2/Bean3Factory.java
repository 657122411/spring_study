package com.tjh.demo2;


//Bean3实例工厂（没有静态方法）
public class Bean3Factory {
    public Bean3 createBean3(){
        System.out.println("Bean3Factory执行方法。。。");
        return new Bean3();
    }
}
