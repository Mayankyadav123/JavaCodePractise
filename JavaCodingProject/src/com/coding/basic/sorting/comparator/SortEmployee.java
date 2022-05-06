package com.coding.basic.sorting.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
// Using comparator and comparable interface
// comparator has compare(obj1,obj2) can have multiple condition sorting and independent of the main class
// comparator has multiple sorting logic
// comparable has compareTo(obj) method work for only single sorting sequence and dependent on main class
// 
public class SortEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee("E1",24,11000));
		employeeList.add(new Employee("E2",21,32000));
		employeeList.add(new Employee("E3",22,10200));
		employeeList.add(new Employee("E4",23,91000));
		employeeList.add(new Employee("E5",20,31000));
		System.out.println(employeeList.toString());

		// Sort by name
		List<Employee> sortedByName = employeeList.stream().sorted((e1,e2)->e1.getName().compareTo(e2.getName())).collect(Collectors.toList());
		
		System.out.println("------------Sorted By Name----------------");
		System.out.println(sortedByName.toString());
		System.out.println("----------------------------");
//		
//		// Sort by age
//		// by Comparable
//		Collections.sort(employeeList);
//		// or by using a comparator
//		Collections.sort(employeeList, new AgeComparator());
//		
//		// Java 8 
//		List<Employee> sortedByAge = (List<Employee>) employeeList.stream()
//				.sorted((e1,e2)-> e1.getAge()-e2.getAge())
//				.collect(Collectors.toList());
//		
//		System.out.println("------------Sorted By Age----------------");
//		System.out.println(sortedByAge.toString());
//		System.out.println("----------------------------");
	}

	static class Employee implements Comparable<Employee>{
		
		private String name;
		private int age;
		private double salary;
		
		public Employee(String string, int i, int j) {
			// TODO Auto-generated constructor stub
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public int compareTo(Employee o) {
			// TODO Auto-generated method stub
			return this.age - o.age;
		}
		
	}
}
