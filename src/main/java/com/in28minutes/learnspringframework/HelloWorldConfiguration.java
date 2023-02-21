package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration{
    @Bean
    public String name(){//managed by spring container
        return "Aarti";
    }


}
