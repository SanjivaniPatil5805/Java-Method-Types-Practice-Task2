package com.practice.methodTask;

public class LibrarySystem {

	public void issueBook(String bookName, boolean isAvailable) {
		
		System.out.println("Book Name = "+bookName);
		
		if(isAvailable == true) {
			
			System.out.println("Book is available in liabrary.");
			
		} else {
			
			System.out.println("Book is not available in library.");
			
		}
		
		
	}
	
}
