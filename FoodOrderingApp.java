package com.practice.methodTask;
import java.util.Scanner;

public class FoodOrderingApp {
 
	Scanner sc = new Scanner(System.in);
	
	public void placeOrder(String item, int quantity) {
		
		System.out.println("Item = "+item);
		System.out.println("Quantity = "+quantity);
		
		System.out.println("Enter price for one "+item+" : ");
		double price = sc.nextDouble();
		
		double totalPrice = price * quantity;
		
		System.out.println("Bill Amount = "+totalPrice);
		
	}
	
	
}
