package spring.annotation;

import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author: GordenTam
 * @create: 2019-09-23
 **/
@Service
public class AnnotationTest {
	public static void main(String[]args){
		Boolean result = AnnotatedElementUtils.isAnnotated(TestConfig.class, Component.class);
		System.out.println(result);
		Class clazz = TestConfig.class;
		Boolean result1 = clazz.isAnnotationPresent(Component.class);
		System.out.println(result1);
	}


}


