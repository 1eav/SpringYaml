package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    private String name;

    @Bean
    public void getRandomNumber() {
        System.out.println(name + " " + Math.random());
    }
}