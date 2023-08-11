package com.billdesk.demo;

public class WrapperDemo {

	public static void main(String[] args) {
		Integer i1 =10; //primitive to wrapper AUTOBOXING
		int i2 = i1.intValue(); //wrapper to primitive UNBOXING
		i2= new Integer(10); //wrapper to primitive AUTOUNBOXING
		
		float f1 = i2; //widening
		float f2 = 1.5f;
		i2= (int)f2; //typecasting
		
		Long l1 = 5l;
		long l2 =5;
		}
		

	}

}
