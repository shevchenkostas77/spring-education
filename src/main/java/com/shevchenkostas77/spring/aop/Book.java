package com.shevchenkostas77.spring.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {

    @Value("Преступление и наказание")
//    @Value("${book.name}")
    private String name;

    public String getName() {
        return name;
    }

}
