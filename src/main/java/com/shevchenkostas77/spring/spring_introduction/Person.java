package com.shevchenkostas77.spring.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("personBean")
public class Person {
//    @Autowired
//    @Qualifier("catBean")
    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

    @Autowired
    public Person(@Qualifier("catBean") Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }

//    public Person(Pet pet) {
//        System.out.println("Person bean is created");
//        this.pet = pet;
//    }

//    public Person() {
//        System.out.println("Person bean is created");
//    }

//    @Autowired
//    @Qualifier("catBean")
    public void setPet(Pet pet) {
        System.out.println("Field pet is set");
        this.pet = pet;
    }

//    @Value("${person.surname}")
    public void setSurname(String surname) {
        System.out.println("Field surname is set");
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setAge(int age) {
        System.out.println("Field age is set");
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet");
        pet.say();
    }
}
