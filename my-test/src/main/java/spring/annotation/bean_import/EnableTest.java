package spring.annotation.bean_import;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(EnableTestImportSelector.class)
public @interface EnableTest {

}
