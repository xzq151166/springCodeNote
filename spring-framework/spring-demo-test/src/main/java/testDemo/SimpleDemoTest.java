package testDemo;

import config.AnnoConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class SimpleDemoTest {


	@SuppressWarnings("all")
	public static void main(String[] args){
		AnnotationConfigApplicationContext annotationConfigApplicationContext
				= new AnnotationConfigApplicationContext(AnnoConfig.class);

		String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
		Arrays.asList(beanDefinitionNames).stream().forEach(e-> System.out.println(e));

	}
}
