package com.tjh.demo6;

import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDao {
    public void save(){
        System.out.println("保存用户");
    }
}
