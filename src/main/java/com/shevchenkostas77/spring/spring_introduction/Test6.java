package com.shevchenkostas77.spring.spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

//        Pet cat1 = context.getBean("catBean", Cat.class);
//        Pet cat2 = context.getBean("catBean", Cat.class);


//        Person person = context.getBean("personBean", Person.class);
//        System.out.println(person.getSurname());
//        System.out.println(person.getAge());
//
//        Person person2 = context.getBean("personBean", Person.class);
//        person.callYourPet();

        context.close();
    }
}
