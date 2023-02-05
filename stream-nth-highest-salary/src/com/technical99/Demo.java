package com.technical99;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Demo {

	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Tarique Anwer", 34, 5000.45);
		Employee e2 = new Employee(102, "Pawan Gupta", 18, 18000.00);
		Employee e3 = new Employee(103, "Arib Anwer", 29, 6000.50);
		Employee e4 = new Employee(104, "Rahul Sharma", 34, 12000.0);
		Employee e5 = new Employee(105, "Anamika Singh", 18, 16000.0);
		
		List<Employee> list = new ArrayList<>();
		list.add(e1); list.add(e2);	list.add(e3); 
		list.add(e4); list.add(e5);
		
		Double res = list.stream().map(Employee::getSalary)
							.sorted(Comparator.reverseOrder()).skip(2).findFirst().get();
		System.out.println(res);
	}
}
