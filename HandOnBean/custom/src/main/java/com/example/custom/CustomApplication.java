package com.example.custom;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CustomApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppContext.class);
        Greeter g = applicationContext.getBean("greeter", Greeter.class); // bean 의 적은 메서드 명을 호출
        String msg = g.greet();
        System.out.println("!!!!");
        System.out.println(msg);
        applicationContext.close();
    }

}
