package spring.annotation.conditional;

import org.springframework.context.annotation.*;
//import org.springframework.core.annotation.Order;

@Configuration
@Scope("prototype")
@ComponentScan
@Import(Config2.class)
public class MyConfiguration {
    @Bean
//    @Order(1)
    @Scope("singleton")
    @Conditional(TestCondition.class)
    public Coffee getTgz(){
        return new Coffee();
    }
}
