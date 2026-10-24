package com.practice.methodTask;

public class ATMSystem {
	
	double accountBalance = 130000.00;

	public double checkBalance() {
	
		return accountBalance;
		
	}
	
	public double withdrawAmount(double amount) {
		
		System.out.println("Withdraw Amount = "+amount);
		double remainingBalance = accountBalance - amount;
		return remainingBalance;
		
	}
	
}
