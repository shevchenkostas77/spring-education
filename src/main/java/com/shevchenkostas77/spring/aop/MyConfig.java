package com.shevchenkostas77.spring.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.shevchenkostas77.spring.aop")
//@PropertySource("classpath:myApp.properties")
@EnableAspectJAutoProxy
public class MyConfig {
}