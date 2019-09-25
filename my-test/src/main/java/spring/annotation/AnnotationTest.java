package spring.annotation;

import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.stereotype.Component;

/**
 * @author: GordenTam
 * @create: 2019-09-23
 **/

public class AnnotationTest {
	public static void main(String[]args){
		Boolean result = AnnotatedElementUtils.isAnnotated(TestConfig.class, Component.class);
		System.out.println(result);
		Class clazz = TestConfig.class;
		Boolean result1 = clazz.isAnnotationPresent(Component.class);
		System.out.println(result1);
	}
}
