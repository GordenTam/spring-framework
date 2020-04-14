package spring.annotation.conditional;

import org.springframework.context.annotation.*;
import spring.annotation.conditional.Tee;
//import org.springframework.core.annotation.Order;

@Configuration
public class Config2 {
    @Bean
    public Tee getTgz1(){
        return new Tee();
    }
}
