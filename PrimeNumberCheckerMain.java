package com.practice.methodTask;

public class PrimeNumberCheckerMain {

	public static void main(String[] args) {
		
		PrimeNumberChecker p = new PrimeNumberChecker();
		
		boolean output = p.isPrime(19);
		
		if(output == true) {
			
			System.out.println("prime number.");
			
		} else {
			
			System.out.println("Not prime number.");
			
		}
		
		
	}
	
}
