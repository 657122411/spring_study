package com.aop.demo2;

public class ProductDao {
    public void add(){
        System.out.println("增加商品");
    }

    public void delete(){
        System.out.println("删除商品");
    }
    public void update(){
        System.out.println("修改商品");
    }
    public void find(){
        System.out.println("查找商品");
    }
}
