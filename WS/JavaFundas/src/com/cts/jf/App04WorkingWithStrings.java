package com.cts.jf;

import java.util.Scanner;

public class App04WorkingWithStrings {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str =scan.nextLine();
		
		String rev = new StringBuilder(str).reverse().toString();
		
		System.out.println(rev);
		
		if(str.equalsIgnoreCase(rev)) {
			System.out.println("Palindrome String");
		}else {
			System.out.println("Not a Palindrome String");
		}
		
		scan.close();
	}

}
