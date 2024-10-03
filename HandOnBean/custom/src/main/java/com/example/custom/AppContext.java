package com.example.custom;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //스프링 설정 클라스로 지정하는 어노테이션
public class AppContext {

    @Bean // 스프링이 관리하는 빈객체를 등록
    public Greeter greeter() {
        Greeter g = new Greeter();
        g.setMessage("This is Message From Greet");
        return g;
    }
}
