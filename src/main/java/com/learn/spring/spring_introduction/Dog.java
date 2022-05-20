package com.learn.spring.spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("dog")
@Scope("singleton")
public class Dog implements Pet{
//    private String name;

    public Dog(){
        System.out.println("Dog bean created!");
    }

    @Override
    public void say(){
        System.out.println("Bow-Wow");
    }

//    @PostConstruct
//    public void init(){
//        System.out.println("Class dog: init method");
//    }
//
//    @PreDestroy
//    public void destroy(){
//        System.out.println("Class dog: destroy method");
//    }

//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
}
