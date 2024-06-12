package com.cts.jf.models;

import java.util.Objects;

public class Employee implements Comparable<Employee> {

	private int empId;
	private String fullName;
	private double salary;
	
	public Employee() {
		//blank intentionally
	}

	public Employee(int empId, String fullName, double salary) {
		super();
		this.empId = empId;
		this.fullName = fullName;
		this.salary = salary;
	}
	
	public Employee(Employee emp) {
		this(emp.empId,emp.fullName,emp.salary);
	}

	@Override
	public int compareTo(Employee o) {
		return ((Integer)this.empId).compareTo(o.empId);
	}
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(empId, fullName, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empId == other.empId && Objects.equals(fullName, other.fullName)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

	@Override
	public String toString() {
		return "empId=" + empId + ", fullName=" + fullName + ", salary=" + salary;
	}

	
			
}
