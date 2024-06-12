package com.cts.jf.models;

import java.util.Objects;

public class BankAccount {

	private String acNo;
	private double currentBalance;
	
	public BankAccount() {
		// TODO Auto-generated constructor stub
	}

	public BankAccount(String acNo, double currentBalance) {
		super();
		this.acNo = acNo;
		this.currentBalance = currentBalance;
	}

	public String getAcNo() {
		return acNo;
	}

	public void setAcNo(String acNo) {
		this.acNo = acNo;
	}

	public double getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}

	@Override
	public int hashCode() {
		return Objects.hash(acNo, currentBalance);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		return Objects.equals(acNo, other.acNo)
				&& Double.doubleToLongBits(currentBalance) == Double.doubleToLongBits(other.currentBalance);
	}

	@Override
	public String toString() {
		return "BankAccount [acNo=" + acNo + ", currentBalance=" + currentBalance + "]";
	}
	
	
}
