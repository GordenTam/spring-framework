package spring.annotation.testimport;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author: GordenTam
 * @create: 2019-10-17
 **/

public class EnableTestImportSelector implements ImportSelector {
	public String[] selectImports(AnnotationMetadata importingClassMetadata){
		return new String[]{"spring.annotation.testimport.Banana"};
	}
}
