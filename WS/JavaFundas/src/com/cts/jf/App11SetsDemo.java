package com.cts.jf;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import com.cts.jf.models.Employee;

public class App11SetsDemo {

	public static void main(String[] args) {

		//Set<Employee> emps = new HashSet<>();
		//Set<Employee> emps = new LinkedHashSet<>();
		//Set<Employee> emps = new TreeSet<>();
		
		Comparator<Employee> fullNameComparator =(e1,e2) -> e1.getFullName().compareTo(e2.getFullName()); 
		Set<Employee> emps = new TreeSet<>(fullNameComparator);
		
		emps.add(new Employee(101, "Vamsy", 45000));
		emps.add(new Employee(111, "Zeenath", 75000));
		emps.add(new Employee(106, "Edward", 15000));
		emps.add(new Employee(104, "Brahma", 85000));
		emps.add(new Employee(108, "Charwik", 15000));
		emps.add(new Employee(107, "Yasodha", 48000));
		emps.add(new Employee(110, "Anjana", 49000));
		emps.add(new Employee(102, "Prathik", 35000));
		emps.add(new Employee(105, "Raghav", 15000));
		emps.add(new Employee(103, "Tanushree", 42000));

		for (Employee emp : emps) {
			System.out.println(emp);
		}
	}
}
