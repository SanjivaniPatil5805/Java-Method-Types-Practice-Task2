package com.practice.methodTask;

public class RideBookingApp {

	public double calculateFare(double distance) {
		
		double baseFare = 10.00;
		
		double ratePerDistance = 3.00;
		
		if(distance < 0 ) {
			
			System.out.println("Invalid Distance.");
			
		}
		
		double totalFare = baseFare + (ratePerDistance * distance);
		
		return totalFare;
		
	}
	
}
