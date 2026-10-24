package com.practice.methodTask;

public class OnlineVotingSystem {

	public int vote(int age) {
		
		if(age > 0 && age <= 100) {
			
			if(age >= 18) {
				
				System.out.println("Eligible for voting.");
				
			} else {
				
				System.out.println("Not eligible for voting.");
				
			}
			
		} else {
			
			System.out.println("Invalid Age.");
			
		}
		
		return 0;
		
	}
	
}
