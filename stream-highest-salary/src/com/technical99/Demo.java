package com.technical99;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Demo {

	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Tarique Anwer", 34, 5000.45);
		Employee e2 = new Employee(101, "Pawan Gupta", 18, 8000.00);
		Employee e3 = new Employee(101, "Arib Anwer", 29, 6500.50);

		List<Employee> list = new ArrayList<>();
		list.add(e1); 
		list.add(e2);
		list.add(e3); 
				
		list.stream().sorted(Comparator.comparing(Employee::getSalary)
						.reversed()).findFirst()
						.ifPresent(x -> System.out.println(x.getSalary()));
		
		Optional<Employee> res = list.stream().sorted(Comparator.comparingDouble(Employee::getSalary)
							.reversed()).findFirst();
		System.out.println(res.get().getSalary());

		Optional<Double> resp = list.stream().map(Employee::getSalary).sorted(Comparator.reverseOrder()).findFirst();
		System.out.println(resp.get());
	}

}
