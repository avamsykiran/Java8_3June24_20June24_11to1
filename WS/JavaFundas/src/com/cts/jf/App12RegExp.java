package com.cts.jf;

import java.util.Scanner;

public class App12RegExp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a mobile number: ");
		String str = scan.next();

		String mobileRegExp = "[1-9][0-9]{9}";
		
		System.out.println("It is "+ (str.matches(mobileRegExp)?"VALID":"NOT VALID"));
		
		scan.close();
	}
}
