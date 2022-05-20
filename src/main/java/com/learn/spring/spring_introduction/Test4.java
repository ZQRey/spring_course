package com.learn.spring.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext contex =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog myDog = contex.getBean("myPet", Dog.class);
//        myDog.setName("Belka");
        Dog yourDog = contex.getBean("myPet", Dog.class);
//        yourDog.setName("Strelka");
        System.out.println("Переменные ссылаются на один и тот же объект? " + (myDog==yourDog));
//        System.out.println(myDog.getName());
//        System.out.println(yourDog.getName());
        contex.close();
    }
}
