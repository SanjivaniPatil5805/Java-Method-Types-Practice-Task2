package com.practice.methodTask;
import java.util.Scanner;

public class ElectricityBill {
	
	Scanner sc = new Scanner(System.in);

	public int calculateBill(int units) {
		
		int pricePerUnit;
		
		System.out.println("Units = "+units);
		
		System.out.println("Enter per unit price :");
		pricePerUnit = sc.nextInt();
		
		int billAmount = units * pricePerUnit;
		
		System.out.println("Bill Amount = "+billAmount+" Rs.");
		
		return billAmount;
		
	}
	
}
