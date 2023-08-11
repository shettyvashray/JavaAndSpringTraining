package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.config.Config;
import com.demo.pojo.Customer;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
//		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		Customer customer=(Customer)context.getBean("cust1");
		System.out.println(customer);
		
	}

}
