package com.cts.jf;

import java.util.Scanner;

public class App05WorkingWithStrings {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str =scan.nextLine().toUpperCase();
		
		for(int i=0;i<str.length();i++) {
			System.out.println(str.substring(0, i+1));
		}
				
		scan.close();
	}

}
