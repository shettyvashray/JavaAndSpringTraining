package com.demo.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Product {
	@Value(value="Boat")
	private String prodname;
	
	public Product() {
		super();
	}
	
	public Product(String prodname) {
		super();
		this.prodname = prodname;
	}

	public String getProdname() {
		return prodname;
	}

	public void setProdname(String prodname) {
		this.prodname = prodname;
	}

	@Override
	public String toString() {
		return "Product [prodname=" + prodname + "]";
	}
}
