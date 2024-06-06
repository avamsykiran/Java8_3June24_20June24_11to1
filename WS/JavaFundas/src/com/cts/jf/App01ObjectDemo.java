package com.cts.jf;

import com.cts.jf.models.ContractEmployee;
import com.cts.jf.models.Employee;

public class App01ObjectDemo {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		Employee e2 = new Employee(1, "Vamsy", 45000.0);
		Employee e3 = e2;
		Employee e4 = new Employee(e2);

		System.out.println(e1 + "\t" + e1.hashCode() + "\t" + System.identityHashCode(e1));
		System.out.println(e2 + "\t" + e2.hashCode() + "\t" + System.identityHashCode(e2));
		System.out.println(e3 + "\t" + e3.hashCode() + "\t" + System.identityHashCode(e3));
		System.out.println(e4 + "\t" + e4.hashCode() + "\t" + System.identityHashCode(e4));

		System.out.println("---------------------------------------------------------");

		System.out.println(e1 == e2);
		System.out.println(e3 == e2);
		System.out.println(e4 == e2);

		System.out.println("---------------------------------------------------------");

		System.out.println(e1.equals(e2));
		System.out.println(e3.equals(e2));
		System.out.println(e4.equals(e2));

		System.out.println("---------------------------------------------------------");

		ContractEmployee cemp = new ContractEmployee(2, "Sagar", 56789,10);
		System.out.println(cemp);
	
		System.out.println("---------------------------------------------------------");

		Employee eobj = new ContractEmployee(3, "Suseela", 89000, 56);
		System.out.println(eobj);
		
		
	}

}
