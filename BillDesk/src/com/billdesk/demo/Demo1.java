package com.billdesk.demo;
import java.util.*;


public class Demo1 {
	
	static boolean checkPrime(int x) {
		boolean isPrime = true;
		
		if(x==0 ||x==1) {
			return false;
		}
		
		for(int i=2; i<x/2;i++) {
			if(x%i== 0) {
				isPrime = false;
			}
		}
		return isPrime;
	}

	public static void main(String[] args) {
		//CALCULATOR
		
//		Calculator calc = new Calculator();
//		
//		System.out.println(args[0]);
//		System.out.println(args[1]);
//		
//		int ans = calc.add(Integer.parseInt(args[0]), Integer.parseInt(args[1]) );
//		
//		System.out.println(ans);
		
		//PRIME NUMBERS
		
//		for(int i=1; i<=50; i++) {
//			int count=0;
//			for(int j=1; j<=50; j++) {
//				if(i%j==0) {
//					count++;
//				}
//			}
//			if(count==2) {
//				System.out.println(i);
//			}
//		}
		
		//PRIME NUMBERS 
		
//		for (int i=1; i<=50; i++) {
//			if(checkPrime(i)) {
//				System.out.println(i);
//			}
//		}
		Scanner sc = new Scanner(System.in);
		String day = sc.nextLine();
		
		switch(day) {
		case "Monday":
		case "Mon":
			System.out.println("not a happy day");
			break;
		case "Tuesday":
		case "Tue":
			System.out.println("not a happy day");
			break;
			
		case "Wednesday":
		case "Wed":
			System.out.println("not a happy day");
			break;
			
		case "Thursday":
		case "Thu":
			System.out.println("not a happy day");
			break;
			
		case "Friday":
		case "Fri":
			System.out.println("close to happy day");
			break;
			
		case "Saturday":
		case "Sat":
			System.out.println("finally a happy day");
			break;
			
		case "Sunday":
		case "Sun":
			System.out.println("finally a happy day");
			break;
		
		default:
			System.out.println("not a valid day");
		}
		
	}

}
 