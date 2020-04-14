package spring.annotation.bean_import;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author: GordenTam
 * @create: 2019-10-17
 **/

public class MyImportSelector implements ImportSelector {
    public String[] selectImports(AnnotationMetadata annotationMetadata){
        return new String[]{"spring.annotation.testimport.Apple"};
    }
}
