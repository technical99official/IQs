package com.technical99;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Demo { 

	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Tarique Anwer", 34, "Development", 5000.0);
		Employee e2 = new Employee(102, "Pawan Gupta", 18, "Operation",18000.0);
		Employee e3 = new Employee(103, "Arib Anwer", 29, "Development",6000.0);
		Employee e4 = new Employee(104, "Rahul Sharma", 34, "Operation",12000.0);
		
		List<Employee> list = new ArrayList<>();
		list.add(e1); list.add(e2);	list.add(e3); list.add(e4);
		
		Map<String, Optional<Employee>> resp = list.stream().collect(Collectors.groupingBy(Employee::getDepartment,
										Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));
		resp.entrySet().forEach(e -> {
			System.out.println(e.getKey() +" --> "+ e.getValue().get().getSalary());
		});
	}
}
