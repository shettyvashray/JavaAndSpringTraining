package com.trial;

public class Product {
	private int prodid;
	private String prodname;
	private double prodcost;
	
	public Product() {
		super();
	}
	
	public Product(int prodid, String prodname, double prodcost) {
		super();
		this.prodid = prodid;
		this.prodname = prodname;
		this.prodcost = prodcost;
	}

	public int getProdid() {
		return prodid;
	}

	public void setProdid(int prodid) {
		this.prodid = prodid;
	}

	public String getProdname() {
		return prodname;
	}

	public void setProdname(String prodname) {
		this.prodname = prodname;
	}

	public double getProdcost() {
		return prodcost;
	}

	public void setProdcost(double prodcost) {
		this.prodcost = prodcost;
	}

	@Override
	public String toString() {
		return "Product [prodid=" + prodid + ", prodname=" + prodname + ", prodcost=" + prodcost + "]";
	}
	
	
	
	

}
