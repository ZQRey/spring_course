package com.learn.spring.spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Pet pet = context.getBean("catBean", Pet.class);
        pet.say();
//        Person person = context.getBean("personBean", Person.class);
//        person.callYourPet();

        context.close();
    }
}
