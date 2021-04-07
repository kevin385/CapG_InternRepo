package com.cg.demo2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ClientDemo2 {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationContextCar.xml");;
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Car car = (Car) factory.getBean("c");
		car.displayCarDetails();
		
		Student student=(Student) factory.getBean("s");
		student.displayDetails();
	}

}
