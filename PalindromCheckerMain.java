package com.practice.methodTask;

public class PalindromCheckerMain {

	public static void main(String[] args) {
		
		PalindromChecker p = new PalindromChecker();
		
		boolean output = p.isPalindrom(141);
		
		if(output == true) {
			
			System.out.println("Palindrom Number");
			
		} else {
			
			System.out.println("Not a Palindrom Number");
			
		}
		
	}
	
}
