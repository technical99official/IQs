package com.technical99;

public class Employee {
	private Integer empId;
	private String name;
	private Integer age;
	private String department;
	private Double salary;
	public Employee(Integer empId, String name, Integer age, String department, Double salary) {
		this.empId = empId;
		this.name = name;
		this.age = age;
		this.department = department;
		this.salary = salary;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", age=" + age + ", department=" + department
				+ ", salary=" + salary + "]";
	}
	
}
