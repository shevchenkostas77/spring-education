package com.shevchenkostas77.spring.spring_introduction;

import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan("com.shevchenkostas77.spring.spring_introduction")
@PropertySource("classpath:myApp.properties")
public class MyConfig {

    @Bean
    @Scope("singleton")
    public Pet catBean() {
        return new Cat();
    }

    @Bean
    @Scope("prototype")
    public Person personBean() {
        return new Person(catBean());
    }
}
