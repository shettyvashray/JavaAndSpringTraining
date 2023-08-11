package com.example.demo.entity;

import javax.persistence.*;

@Entity
public class Driver {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int driverid;
	@Column(name="dname")
	private String name;
	private long contactno;
	
	public Driver(int driverid, String name, long contactno) {
		super();
		this.driverid = driverid;
		this.name = name;
		this.contactno = contactno;
	}

	public Driver() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getDriverid() {
		return driverid;
	}

	public void setDriverid(int driverid) {
		this.driverid = driverid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getContactno() {
		return contactno;
	}

	public void setContactno(long contactno) {
		this.contactno = contactno;
	}

}
