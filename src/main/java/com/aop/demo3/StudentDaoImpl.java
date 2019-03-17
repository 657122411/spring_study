package com.aop.demo3;

public class StudentDaoImpl implements StudentDao{

    @Override
    public void find() {
        System.out.println("学生查询");
    }

    @Override
    public void add() {
        System.out.println("学生增加");
    }

    @Override
    public void detele() {
        System.out.println("学生删除");
    }

    @Override
    public void update() {
        System.out.println("学生修改");
    }
}
