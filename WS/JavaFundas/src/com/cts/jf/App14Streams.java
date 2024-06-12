package com.cts.jf;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.cts.jf.models.Employee;

public class App14Streams {

	public static void main(String[] args) {

		List<Employee> emps = new ArrayList<>();

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

		emps.stream().forEach(System.out::println);
		System.out.println("------------------------------------------------");

		emps.stream().forEach(e -> e.setSalary(e.getSalary() * 2));
		emps.stream().forEach(System.out::println);
		System.out.println("------------------------------------------------");

		Optional<Employee> maxSalaried =  emps.stream().reduce((e1, e2) -> e1.getSalary() > e2.getSalary() ? e1 : e2);
		System.out.println(maxSalaried.get());
		System.out.println("------------------------------------------------");
		
		emps.stream().filter( e -> e.getFullName().indexOf("r")>-1).forEach(System.out::println);
		System.out.println("------------------------------------------------");

		Set<Employee> empSet = emps.stream().filter( e -> e.getFullName().indexOf("s")>-1).collect(Collectors.toSet());
		empSet.stream().forEach(System.out::println);
		System.out.println("------------------------------------------------");

		emps.stream().filter( e -> e.getFullName().indexOf("r")>-1).map(e -> e.getFullName()).forEach(System.out::println);
		System.out.println("------------------------------------------------");

		Set<String> empNamesSet = emps.stream().filter( e -> e.getFullName().indexOf("s")>-1).map(Employee::getFullName).collect(Collectors.toSet());
		System.out.println(empNamesSet);
		System.out.println("------------------------------------------------");

	}
}
