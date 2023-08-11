package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan
//@EnableAutoConfiguration
//@SpringBootConfiguration
public class MySbAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySbAppApplication.class, args);
		System.out.println("My springboot app started");
	}

}
