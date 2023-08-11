package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Vehicle;
import com.example.demo.exception.DriverMissingException;
import com.example.demo.exception.VehicleIdNotFoundException;
import com.example.demo.service.IVehicleService;

@RestController
@CrossOrigin("http://localhost:3000/")
@RequestMapping("/vehicle")
public class VehicleController {
	
	@Autowired
	private IVehicleService service;
	
	@GetMapping(value="/get", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Vehicle> getVehicleList() {
		return service.getAllVehicles();
	}
	
	@PostMapping("/add")
	public ResponseEntity<Vehicle> addVehicle(@RequestBody Vehicle v1) throws DriverMissingException {
		Vehicle veh1 = service.insertVehicle(v1);
		return new ResponseEntity<Vehicle>(veh1,HttpStatus.CREATED);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity updateVehicle(@PathVariable int id, @RequestBody Vehicle v2) throws VehicleIdNotFoundException {
		Vehicle veh2 = service.updateVehicle(id, v2);
		return new ResponseEntity(veh2,HttpStatus.OK);
//		try{
//			Vehicle veh2 = service.updateVehicle(id, v2);
//			return new ResponseEntity(veh2,HttpStatus.OK);
//		 }
//		catch(VehicleIdNotFoundException vehicleIdNotFoundException ){
//		  return new ResponseEntity("Vehicle not found", HttpStatus.CONFLICT);
//		 }
	}
	
	@DeleteMapping("/delete")
    public void deleteAll() {
        service.deleteAllData();
    }
	
	@DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteId(@PathVariable int id) throws VehicleIdNotFoundException {
		service.deleteByid(id);
	    return new ResponseEntity<String>("Vehicle deleted successfully", HttpStatus.OK);
//		try{
//			service.deleteByid(id);
//		    return new ResponseEntity<String>("Vehicle deleted successfully", HttpStatus.OK);
//		 }
//		catch(VehicleIdNotFoundException vehicleIdNotFoundException ){
//		  return new ResponseEntity<String>("Vehicle not found", HttpStatus.CONFLICT);
//		 }
    }
	
	@GetMapping(value="/search/{brand}", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Vehicle>> getVehiclebyBrand(@PathVariable String brand) {
		List<Vehicle> list1 = service.searchVehicleByBrand(brand);
		return new ResponseEntity<List<Vehicle>>(list1,HttpStatus.OK);
	}
}
