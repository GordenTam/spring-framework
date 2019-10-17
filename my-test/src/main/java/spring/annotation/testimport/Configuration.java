package spring.annotation.testimport;

import org.springframework.context.annotation.Import;

/**
 * @author: GordenTam
 * @create: 2019-10-17
 **/
@org.springframework.context.annotation.Configuration
@Import(MyImportSelector.class)
@EnableTest
public class Configuration {
}
