package com.trial;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Customer implements InitializingBean, DisposableBean {
	private int custid;
	private String custname;
	private double custbill;
	
	public Customer() {
		super();
	}

	public Customer(int custid, String custname, double custbill) {
		super();
		this.custid = custid;
		this.custname = custname;
		this.custbill = custbill;
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

	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", custname=" + custname + ", custbill=" + custbill + "]";
	}
	
	public void initCust() {
		System.out.println("Customer initialized");
	}
	
	public void destroyCust() {
		System.out.println("Customer destroyed");
	}
	
	public void afterPropertiesSet()throws Exception {
		System.out.println("setup activity");
	}
	
	public void destroy() throws Exception {
		System.out.println("teardown activity");
	}
	
}
