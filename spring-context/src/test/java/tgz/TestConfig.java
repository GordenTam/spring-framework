package tgz;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
//import org.springframework.core.annotation.Order;

@Configuration
@Scope("prototype")
public class TestConfig {
    @Bean
//    @Order(1)
    @Scope("singleton")
    @Conditional(TestCondition.class)
    public tgz getTgz(){
        return new tgz();
    }
}
