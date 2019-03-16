package com.tjh.demo3;

public class UserDaoImpl implements UserDao{

    @Override
    public void add() {
        System.out.println("增");
    }

    @Override
    public void delete() {
        System.out.println("删");
    }

    @Override
    public void update() {
        System.out.println("改");
    }

    @Override
    public void find() {
        System.out.println("查");
    }
}
