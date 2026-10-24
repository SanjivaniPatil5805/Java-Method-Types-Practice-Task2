package com.practice.methodTask;

public class GradeCalculator {

	public String getGrade(int marks) {
		
		if(marks > 0 && marks <= 100) {
			
			if(marks >= 80) {
				
				return "A Grade";
				
			} else if(marks >= 65  && marks <= 79) {
				
				return "B Grade";
				
			} else if(marks >= 50 && marks <= 64) {
				
				return "C Grade";
				
			} else if(marks >= 35 && marks <= 49) {
				
				return "D Grade";
				
			} else {
				
				return "Fail";
				
			}
			
		} else {
			
			return "Enter Valid Marks";
			
		}
		
	}
	
}
