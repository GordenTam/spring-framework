package spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test{
    public static void main(String[]args){
//        BeanFactory c=new ClassPathXmlApplicationContext("bean.xml");
//        tgz t=(tgz)c.getBean("test");
//        t.getAbc();
//        List features=new ArrayList();
//        features.forEach();
//        try{
//            String abc = null;
//            Map m = (Map)JSONObject.parse(abc);
//        }catch(RuntimeException e){
//            System.out.println(e);
//        }
//        Object o =null;
//        Integer abc = (Integer)o;
//        if(abc!=200){
//            System.out.println(abc);
//        }

        ApplicationContext ac =new AnnotationConfigApplicationContext(TestConfig.class);
        ClassPathXmlApplicationContext ca =new ClassPathXmlApplicationContext();

    }
}