package spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class test{
    public static void main(String[]args){
        ApplicationContext ac =new AnnotationConfigApplicationContext(TestConfig.class);
//		System.out.println(LocalDateTime.now().toInstant(ZoneOffset.ofHours(8)).toEpochMilli());
    }
}