package spring.annotation.bean_import;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author: GordenTam
 * @create: 2019-10-18
 **/

public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry){
		System.out.println(importingClassMetadata.getAnnotationAttributes(EnableImportBeanDefinitionRigistrarTest.class.getName(),true));
		registry.registerBeanDefinition("spring.annotation.testimport.Peer",new RootBeanDefinition(Peer.class));
	}
}
