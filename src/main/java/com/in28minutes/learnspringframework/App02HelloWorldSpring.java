package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        // Launch a Spring Context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        // Configure the things that we want Spring to manage-
        // HelloWorldConfiguration @Configuration
        // name-@Bean
        System.out.println(context.getBean("name"));

    }

}
