package com.cts.jf;

import java.util.Scanner;

import com.cts.jf.exceptions.BankingException;
import com.cts.jf.models.BankAccount;
import com.cts.jf.service.BankingService;

public class App09UserDefinedExceptionsDemo {

	static Scanner scan ;
	
	public static void main(String[] args) {

		scan = new Scanner(System.in);

		BankAccount acc = new BankAccount("SB0000",45000);
		BankingService bService = new BankingService();
		
		boolean shallContinue = true;
		double amount=0;
		
		while(shallContinue) {
			
			System.out.println("Enter Command (deposite/withdraw/quit)> ");
			String cmd = scan.nextLine().toLowerCase();
			
			switch(cmd) {
			case "deposite": 
				System.out.println("Enter amount> ");
				amount = readDouble();
				try {
					bService.deposit(acc, amount);
					System.out.println("Balance: "+acc.getCurrentBalance());
				} catch (BankingException e) {
					System.out.println(e.getMessage());
				}
				break;
			case "withdraw":
				System.out.println("Enter amount> ");
				amount = readDouble();
				try {
					bService.withdraw(acc, amount);
					System.out.println("Balance: "+acc.getCurrentBalance());
				} catch (BankingException e) {
					System.out.println(e.getMessage());
				}
				
				break;
			case "quit": shallContinue=false; break;
			default:
				System.out.println("Not a known command");
			}
		}
		System.out.println("Application Closed");
		
		scan.close();
	}

	static double readDouble() {
		while(!scan.hasNextDouble()) { //InputMismatchException is avoided.
			scan.nextLine();
			System.out.println("A non-decimal number expected!");
		}
		return scan.nextDouble();
	}
}
