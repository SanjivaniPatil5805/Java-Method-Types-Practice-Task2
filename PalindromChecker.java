package com.practice.methodTask;

public class PalindromChecker {

	public boolean isPalindrom(int num) {
		
		int temp = num;
		int reverse = 0;
		
		while(temp >= 1) {
			
			int digit = temp % 10;
			reverse = reverse * 10 + digit;
			temp = temp / 10;
			
		}
		
		if(num == reverse) {
			
			return true;
			
		} else {
			
			return false;
			
		}
		
	}
	
}
