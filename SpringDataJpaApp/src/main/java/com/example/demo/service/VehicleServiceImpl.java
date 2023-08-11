package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IVehicleDao;
import com.example.demo.entity.Vehicle;
import com.example.demo.exception.DriverMissingException;
import com.example.demo.exception.VehicleIdNotFoundException;

@Service
public class VehicleServiceImpl implements IVehicleService {
	@Autowired
	private IVehicleDao dao;

	@Override
	public List<Vehicle> getAllVehicles() {
		List<Vehicle> list = dao.findAll();
		return list;
	}

	@Override
	public Vehicle insertVehicle(Vehicle v) throws DriverMissingException {
		if(v.getDriver()==null) {
			throw new DriverMissingException();
		}
		return dao.save(v);
	}

	@Override
	public void deleteAllData() {
		dao.deleteAll();
		
	}

	@Override
	public void deleteByid(int id) throws VehicleIdNotFoundException{
		if(dao.findById(id).isEmpty()) {
			throw new VehicleIdNotFoundException();
		} else {
			dao.deleteById(id);
		}
	}

	@Override
	public Vehicle updateVehicle(int id, Vehicle v) throws VehicleIdNotFoundException {
		if(dao.findById(id).isEmpty()) {
			throw new VehicleIdNotFoundException();
		} else {
			return dao.save(v);
		}
	}


	@Override
	public List<Vehicle> searchVehicleByBrand(String brand) {
		return dao.getVehicleByBrand(brand);
	}
	

}
