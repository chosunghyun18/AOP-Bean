package com.example.custom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomApplication {

    public static void main(String[] args) {
        System.out.println("Start Custom Bean Creation");
        SpringApplication.run(CustomApplication.class, args);
    }

}
