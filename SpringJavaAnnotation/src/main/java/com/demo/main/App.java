package com.demo.main;

import com.demo.pojo.*;
import com.demo.config.Config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		Customer cust1=(Customer)context.getBean("c1");
		System.out.println(cust1.getCustname());
		
		
	}

}
