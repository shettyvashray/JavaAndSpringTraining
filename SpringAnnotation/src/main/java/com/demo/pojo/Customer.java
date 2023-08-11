package com.demo.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="cust1")
public class Customer {
	@Value(value="101")
	private int custid;
	private String custname;
	private double custbill;
	@Autowired
	private Product prod;
	
	public Customer() {
		super();
	}
	
	public Customer(int custid, String custname, double custbill, Product prod) {
		super();
		this.custid = custid;
		this.custname = custname;
		this.custbill = custbill;
		this.prod = prod;
	}

	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public double getCustbill() {
		return custbill;
	}

	public void setCustbill(double custbill) {
		this.custbill = custbill;
	}

	public Product getProd() {
		return prod;
	}

	public void setProd(Product prod) {
		this.prod = prod;
	}

	public void initCust() {
		System.out.println("Customer initialized");
	}
	
	public void destroyCust() {
		System.out.println("Customer destroyed");
	}

	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", custname=" + custname + ", custbill=" + custbill + ", prod=" + prod
				+ "]";
	}
	
	
}
