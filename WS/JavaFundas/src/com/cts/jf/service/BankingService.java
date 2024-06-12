package com.cts.jf.service;

import com.cts.jf.exceptions.BankingException;
import com.cts.jf.models.BankAccount;

public class BankingService {

	public void deposit(BankAccount acc,double amount) throws BankingException {
		
		if(amount<0) {
			throw new BankingException("Negative Amount can not be deposited");
		}
		
		if(acc!=null) {
			acc.setCurrentBalance(acc.getCurrentBalance()+amount);
		}
	}
	
	public void withdraw(BankAccount acc,double amount) throws BankingException {
		
		if(amount<0) {
			throw new BankingException("Negative Amount can not be withdrawan");
		}
		
		if(acc!=null) {
		
			if(acc.getCurrentBalance()<amount) {
				throw new BankingException("InSufficient Funds");
			}
			
			acc.setCurrentBalance(acc.getCurrentBalance()-amount);
		}
	}
}
