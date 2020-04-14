package spring.annotation.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author GordenTam
 * @since 2020-04-09
 **/

public class ApplicationStarter {

	public static void main(String []args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MyConfiguration.class);
	}
}
