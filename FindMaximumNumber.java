package com.practice.methodTask;

public class FindMaximumNumber {

	public String findMax(int a, int b, int c) {
		
		if(a > b && a > c) {
			
			return "Maximum Number = "+a;
			
		} else if(b > a && b > c) {
			
			return "Maximum Number = "+b;
			
		} else if(c > a && c > b) {
			
			return "Maximum Number = "+c;
			
		} else {
			
			return "Enter Different Numbers.";
			
		}
		
	}
	
}
