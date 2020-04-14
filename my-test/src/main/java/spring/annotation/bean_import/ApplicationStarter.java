package spring.annotation.bean_import;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: GordenTam
 * @create: 2019-10-17
 **/
public class ApplicationStarter {
    public static void main(String[]args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(MyConfiguration.class);
    }

}
