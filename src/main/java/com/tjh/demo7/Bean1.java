package com.tjh.demo7;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("bean1")
public class Bean1 {

    @PostConstruct
    public void init(){
        System.out.println("init bean.");
    }

    public void say(){
        System.out.println("saying...");
    }

    @PreDestroy
    public void destory(){
        System.out.println("destroy bean");
    }
}
