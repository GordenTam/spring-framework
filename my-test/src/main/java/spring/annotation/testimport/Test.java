package spring.annotation.testimport;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: GordenTam
 * @create: 2019-10-17
 **/

public class Test {
    public static void main(String[]args){
        ApplicationContext ac =new AnnotationConfigApplicationContext(Configuration.class);
    }

}
