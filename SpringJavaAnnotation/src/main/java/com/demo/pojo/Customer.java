package com.demo.pojo;

public class Customer {
	private int custid;
	private String custname;
	private double custbill;
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
	
}
