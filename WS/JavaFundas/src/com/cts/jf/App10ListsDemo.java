package com.cts.jf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.cts.jf.models.Employee;

public class App10ListsDemo {

	public static void main(String[] args) {

		List<Employee> emps = new ArrayList<>();
		
		emps.add(new Employee(101,"Vamsy",45000));
		emps.add(new Employee(111,"Zeenath",75000));
		emps.add(new Employee(106,"Edward",15000));
		emps.add(new Employee(104,"Brahma",85000));
		emps.add(new Employee(108,"Charwik",15000));
		emps.add(new Employee(107,"Yasodha",48000));
		emps.add(new Employee(110,"Anjana",49000));
		emps.add(new Employee(102,"Prathik",35000));
		emps.add(new Employee(105,"Raghav",15000));
		emps.add(new Employee(103,"Tanushree",42000));
		
		for(Employee emp: emps) {
			System.out.println(emp);
		}
		
		System.out.println("--------------------------------------------------------------");
		
		Collections.sort(emps);
		for(Employee emp: emps) {
			System.out.println(emp);
		}

		System.out.println("--------------------------------------------------------------");
		
		Comparator<Employee> fullNameComparator =(e1,e2) -> e1.getFullName().compareTo(e2.getFullName()); 
		Collections.sort(emps, fullNameComparator  );
		for(Employee emp: emps) {
			System.out.println(emp);
		}

		System.out.println("--------------------------------------------------------------");
		
		Comparator<Employee> salaryComparator =(e1,e2) -> ((Double)e1.getSalary()).compareTo(e2.getSalary());
		Collections.sort(emps, salaryComparator);
		for(Employee emp: emps) {
			System.out.println(emp);
		}

	}
}
