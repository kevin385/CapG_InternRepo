package com.cg.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.service.ServiceImpl;

public class DaoClient {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ServiceImpl service = (ServiceImpl) context.getBean("service");
		service.connectWhichWay();
	}

}
