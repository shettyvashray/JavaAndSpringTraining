package com.example.demo.exception;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @Value(value = "${data.exception.message1}")
    private String message1;
    @Value(value = "${data.exception.message2}")
    private String message2;
//    @Value(value = "${data.exception.message3}")
//    private String message3;
    
    @ExceptionHandler(value = VehicleIdNotFoundException.class)
    public ResponseEntity vehicleIdNotFoundException(VehicleIdNotFoundException vehicleIdNotFoundException) {
        return new ResponseEntity(message1, HttpStatus.NOT_FOUND);
    }
    
    @ExceptionHandler(value = DriverMissingException.class)
    public ResponseEntity DriverMissingException(DriverMissingException driverMissingException) {
        return new ResponseEntity(message2, HttpStatus.NOT_FOUND);
    }
   
}