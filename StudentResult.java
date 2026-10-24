package com.practice.methodTask;

public class StudentResult {

	public double calculatePercentage(int m1, int m2, int m3) {
		
		System.out.println("First Subject Marks : "+m1);
		System.out.println("Second Subject Marks : "+m2);
		System.out.println("Third Subject Marks : "+m3);
		
		double percentage = (m1 + m2 + m3) * 100 / 300;
		
		return percentage;
		
	}
	
}
