package spring.annotation;

import org.springframework.context.annotation.*;
//import org.springframework.core.annotation.Order;

@Configuration
public class Config2 {
    @Bean
    public tgz1 getTgz1(){
        return new tgz1();
    }
}
