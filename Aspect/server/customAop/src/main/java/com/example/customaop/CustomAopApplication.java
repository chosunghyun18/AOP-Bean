package com.example.customaop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomAopApplication {

    public static void main(String[] args) {
        System.out.println("Start Custom AOP Example");
        SpringApplication.run(CustomAopApplication.class, args);
    }

}
