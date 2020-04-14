package spring.annotation.bean_import;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author: GordenTam
 * @create: 2019-10-17
 **/

public class EnableTestImportSelector implements ImportSelector {
	public String[] selectImports(AnnotationMetadata importingClassMetadata){
		System.out.println(importingClassMetadata.getAnnotationAttributes(EnableTest.class.getName(),true));
		return new String[]{"spring.annotation.testimport.Banana"};
	}
}
