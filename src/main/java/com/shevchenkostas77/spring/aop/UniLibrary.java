package com.shevchenkostas77.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("Мы берем книгу из UniLibrary");
    }

    public void returnBook() {
        System.out.println("Мы возращаем книгу в UniLibrary");
    }

    public void getMagazine() {
        System.out.println("Мы берем журнал из UniLi brary");
    }

    public void returnMagazine() {
        System.out.println("Мы возращаем журнал в UniLibrary");
    }

    public void addBook() {
        System.out.println("Мы добавляем книгу в UniLibrary");
    }

    public void addMagazine() {
        System.out.println("Мы добавляем журнал в UniLibrary");
    }
}
