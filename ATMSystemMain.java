package com.practice.methodTask;

public class ATMSystemMain {

	public static void main(String[] args) {
		
		ATMSystem atm = new ATMSystem();
		
		System.out.println("Account Balance = "+atm.checkBalance());
		System.out.println("Remaining Balance = "+atm.withdrawAmount(25000.00));
		
	}
	
}
