package com.cts.jf.models;

public class ContractEmployee extends Employee {
	
	private int contractDuration;
	
	public ContractEmployee() {
		//blank intentionally
	}

	public ContractEmployee(int empId, String fullName, double salary,int contractDuration) {
		super(empId, fullName, salary);
		this.contractDuration = contractDuration;
	}

	@Override
	public String toString() {
		return  super.toString() + "\tcontractDuration=" + contractDuration ;
	}
	
}
