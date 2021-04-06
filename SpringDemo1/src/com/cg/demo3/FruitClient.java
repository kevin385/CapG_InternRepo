package com.cg.demo3;

//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.core.io.Resource;

public class FruitClient {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
//		Resource resource = new ClassPathResource("applicationContext3.xml");
//		BeanFactory context = new XmlBeanFactory(resource);
		
		Fruit fr =(Fruit)context.getBean("fruit");
		fr.displayNames();
	}

}
