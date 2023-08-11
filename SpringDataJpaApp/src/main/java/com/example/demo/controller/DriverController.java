package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Driver;
import com.example.demo.service.IDriverService;

@RestController
@RequestMapping("/driver")
public class DriverController {
	@Autowired
	private IDriverService service;
	
//	@GetMapping("/greet")
//	public String greet() {
//		return "Good morning";
//	}
//	
//	@GetMapping("/greetme/{name}")
//	public String greetme(@PathVariable String name) {
//		return "Good morning " + name;
//	}
	
//	@GetMapping(value="/get", produces=MediaType.APPLICATION_JSON_VALUE)
//	public List<Driver> getDriverList() {
//		return service.getAllDrivers();
//	}
	
	@GetMapping(value="/get", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Driver>> getDriverList() {
		List<Driver> list1 = service.getAllDrivers();
		return new ResponseEntity<List<Driver>>(list1, HttpStatus.OK);
	}
}
