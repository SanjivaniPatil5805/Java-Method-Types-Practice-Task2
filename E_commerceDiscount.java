package com.practice.methodTask;
import java.util.Scanner;

public class E_commerceDiscount {
	
	Scanner sc = new Scanner(System.in);

	public void claculateDiscount(double price) {

		int discount;
		
		System.out.println("Enter discount percentage :");
		discount  = sc.nextInt();
		
		double finalPrice = price - (price * discount / 100);
		
		System.out.println("Price before discount = "+price);
		System.out.println("Price after discount = "+finalPrice);
		
	}
	
}
