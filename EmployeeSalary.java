package com.practice.methodTask;

public class EmployeeSalary {

	public double calculateSalary(double basic) {
		
		double hraPercentage = 0.40;
		double daPercentage = 0.20;
		
		double hra = basic * hraPercentage;
		double da = basic * daPercentage;
		
		double totalSalary = basic + hra + da;
		
		System.out.println("Basic salary = "+basic);
		System.out.println("HRA = "+hra);
		System.out.println("DA = "+da);
		
		return totalSalary;
		
	}
	
}
