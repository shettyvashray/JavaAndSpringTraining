package com.trial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

	public static void main(String[] args) {
		
		AbstractApplicationContext a1= new ClassPathXmlApplicationContext("config.xml");
		
		Customer c1 = (Customer)a1.getBean("cust1");
		a1.registerShutdownHook();
		a1.close();
		
//		Customer c2 = (Customer)a1.getBean("cust1");
//		Product p1 = (Product)a1.getBean("prod1");
		
		System.out.println(c1);
		System.out.println(c1.hashCode());
//		System.out.println(c2);
//		System.out.println(c2.hashCode());
//		System.out.println(p1);
		

	}

}
