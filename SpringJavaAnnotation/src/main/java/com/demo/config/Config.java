package com.demo.config;

import org.springframework.context.annotation.*;

import com.demo.pojo.*;

@Configuration
public class Config {
	@Bean(name="c1", initMethod="initCust", destroyMethod="destroyCust")
	@Scope("singleton")
	public Customer getCust1() {
		Customer c = new Customer();
		c.setCustid(111);
		c.setCustname("Ashray");
		c.setProd(getProd1());
		return c;
	}
	
	@Bean(name="p1")
	@Scope("singleton")
	public Product getProd1() {
		Product p = new Product();
		p.setProdid(4567);
		p.setProdname("Toy");
		return p;
	}
}
