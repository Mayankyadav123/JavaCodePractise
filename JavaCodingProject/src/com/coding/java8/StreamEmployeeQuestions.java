package com.coding.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class StreamEmployeeQuestions {
	
	public static void main(String[] args) {
		ArrayList<Employee> empList= new ArrayList<>(
				Arrays.asList(
						new Employee(1, "E1", 26, "D1", 110000),
						new Employee(2, "E2", 28, "D2", 20000),
						new Employee(5, "E5", 28, "D2", 23000),
						new Employee(3, "E3", 24, "D1", 10000),
						new Employee(4, "E4", 32, "D3", 130000),
						new Employee(6, "E6", 33, "D3", 12000),
						new Employee(7, "E7", 32, "D3", 14000)
						));
		
		//1. Find Employee with Maximum salary
		 Optional<Employee> maxSalEmp= empList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
		 
		 System.out.println("===========>"+maxSalEmp.get().getSalary());
		 
		//2. Find Max salary by Department
		 Map<String, Object> maxbydept = empList.stream()
				 .collect(Collectors.groupingBy(Employee::getDepartment,
						 Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(e->e.getSalary())), Optional::get)));
		 
		 maxbydept.entrySet().forEach( obj -> System.out.println(obj.getKey()+":"+obj.getValue().toString()));
		 
		 //3. Find second Max salary
		 Optional<Employee> secondMaxSalary = empList.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).skip(1).findFirst();
		 
		 System.out.println("====>"+secondMaxSalary.get().getSalary());
		 
		 //4. Find second Max salary by department
		 Map<String,Object> secondMaxbyDept = empList.stream()
				    .collect(Collectors.groupingBy(
				            Employee::getDepartment,
				            Collectors.collectingAndThen(Collectors.toList(),
				                list -> list.stream()
				                    .sorted(Comparator.comparing(Employee::getSalary))
				                    .skip(1).findFirst().orElseThrow())
				        ));
		 
		secondMaxbyDept.entrySet().forEach( obj -> System.out.println(obj.getKey()+":"+obj.getValue().toString()));

		 
	}

}
