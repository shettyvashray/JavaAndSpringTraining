package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		ApplicationContext c1= new ClassPathXmlApplicationContext("beans.xml");
		
		Employee e1= (Employee)c1.getBean("emp1");
		
//		System.out.println(e1.getEmpid()+" "+e1.getEname()+""+ e1.getSalary());
		System.out.println(e1);
	}

}
