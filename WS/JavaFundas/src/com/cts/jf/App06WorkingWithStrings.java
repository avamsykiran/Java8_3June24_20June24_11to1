package com.cts.jf;

import java.util.Scanner;

public class App06WorkingWithStrings {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str =scan.nextLine().toUpperCase();
	
		int sentences = 0;
		int words = 0;		
		int letters=0;
		int digits=0;
		int specialChars=0;
		
		for(char ch : str.toCharArray()) {
			if(Character.isLetter(ch)) letters++;
			else if(Character.isDigit(ch)) digits++;
			else {				
				specialChars++;
				
				if(ch=='.') sentences++;
				else if(ch==' ') words++;
			}
		}
		
		System.out.println("Numbe of sentences: "+ sentences);
		System.out.println("Numbe of words: "+ words);
		System.out.println("Numbe of letters: "+ letters);
		System.out.println("Numbe of digits: "+ digits);
		System.out.println("Numbe of Special Chars: "+ specialChars);
		
		
		scan.close();
	}

}
