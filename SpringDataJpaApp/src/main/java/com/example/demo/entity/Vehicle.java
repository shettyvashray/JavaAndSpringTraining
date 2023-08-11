package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name="VehicleDetails")
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seq")
	@SequenceGenerator(name = "seq", sequenceName = "seq", initialValue = 10001)
	private int vehicleid;
	@Column(name="model")
	private String modelno;
	@Column(name="comp")
	private String company;
	private String description;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="driverno", referencedColumnName="driverid")
	private Driver driver;

	public Vehicle(int vehicleid, String modelno, String company, String description, Driver driver) {
		super();
		this.vehicleid = vehicleid;
		this.modelno = modelno;
		this.company = company;
		this.description = description;
		this.driver = driver;
	}

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getVehicleid() {
		return vehicleid;
	}

	public void setVehicleid(int vehicleid) {
		this.vehicleid = vehicleid;
	}

	public String getModelno() {
		return modelno;
	}

	public void setModelno(String modelno) {
		this.modelno = modelno;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleid=" + vehicleid + ", modelno=" + modelno + ", company=" + company + ", description="
				+ description + ", driver=" + driver + "]";
	}
	

}
