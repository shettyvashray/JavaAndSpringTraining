package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Vehicle;
import com.example.demo.exception.DriverMissingException;
import com.example.demo.exception.VehicleIdNotFoundException;

public interface IVehicleService {
	public List<Vehicle> getAllVehicles();
	public Vehicle insertVehicle(Vehicle v) throws DriverMissingException;
	public void deleteAllData();
	public void deleteByid(int id) throws VehicleIdNotFoundException;
	public Vehicle updateVehicle(int id, Vehicle v) throws VehicleIdNotFoundException;
	public List<Vehicle> searchVehicleByBrand(String brand);
}
