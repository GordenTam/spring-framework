package spring.annotation;

import org.springframework.context.annotation.*;
//import org.springframework.core.annotation.Order;

@Configuration
@Scope("prototype")
@ComponentScan
@Import(Config2.class)
public class TestConfig {
    @Bean
//    @Order(1)
    @Scope("singleton")
    @Conditional(TestCondition.class)
    public tgz getTgz(){
        return new tgz();
    }
}
