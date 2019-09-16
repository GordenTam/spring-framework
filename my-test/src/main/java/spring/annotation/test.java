package spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test{
    public static void main(String[]args){
        ApplicationContext ac =new AnnotationConfigApplicationContext(TestConfig.class);
    }
}