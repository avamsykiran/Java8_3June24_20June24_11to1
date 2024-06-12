package com.cts.jf;

import java.util.Scanner;

public class App08UnCheckedExceptions {

	static Scanner scan ;
	
	public static void main(String[] args) {

		scan = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int x = readInt();

		System.out.println("Enter another number: ");
		int y = readInt();

		if (y != 0) { //ArithemticException is avoided.
			System.out.println("The qut is : " + (x / y));
		} else {
			System.out.println("Division by zero is not allowed");
		}
		System.out.println("Appliction Terminated!");

		scan.close();
	}

	static int readInt() {
		while(!scan.hasNextInt()) { //InputMismatchException is avoided.
			scan.nextLine();
			System.out.println("A non-decimal number expected!");
		}
		return scan.nextInt();
	}
}
