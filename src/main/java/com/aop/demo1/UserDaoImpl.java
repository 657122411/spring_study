package com.aop.demo1;

public class UserDaoImpl implements UserDao{

    @Override
    public void add() {
        System.out.println("保存");
    }

    @Override
    public void delete() {
        System.out.println("删除");
    }

    @Override
    public void update() {
        System.out.println("修改");
    }

    @Override
    public void find() {
        System.out.println("查找");
    }
}
