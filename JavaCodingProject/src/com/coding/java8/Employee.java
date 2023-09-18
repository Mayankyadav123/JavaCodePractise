package com.coding.java8;

import java.util.Objects;

public class Employee {

	private int empId;
	private String name;
	private int age;
	private String department;
	private int salary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, department, empId, name, salary);
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
		return age == other.age && Objects.equals(department, other.department) && empId == other.empId
				&& Objects.equals(name, other.name) && salary == other.salary;
	}
	public Employee(int empId, String name, int age, String department, int salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.age = age;
		this.department = department;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", age=" + age + ", department=" + department
				+ ", salary=" + salary + "]";
	}
	
	
}
