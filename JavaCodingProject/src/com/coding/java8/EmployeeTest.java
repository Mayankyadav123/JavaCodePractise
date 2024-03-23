package com.coding.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> empList = new ArrayList<Employee>(Arrays.asList(
				new Employee(1, "E1", 26, "D1", 110000),
				new Employee(2, "E2", 28, "D2", 20000),
				new Employee(5, "E5", 28, "D2", 23000),
				new Employee(3, "E3", 24, "D1", 10000),
				new Employee(4, "E4", 32, "D3", 130000),
				new Employee(6, "E6", 33, "D3", 10000),
				new Employee(7, "E7", 32, "D3", 14000)
				));
		
		
		//1. Find Employee with Maximum salary
		
		Optional<Employee> emp = empList.stream().collect(Collectors.maxBy(Comparator.comparingInt(Employee::getSalary)));
		System.out.println(emp.toString());
		
		// Find Max salary
		int maxsal= empList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary))).get().getSalary();

		System.out.println(maxsal);

		//2. Find Max salary by Department
		Map<String,Integer> maxsalbydept = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment,
				Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)), obj->obj.get().getSalary())));
		
		maxsalbydept.entrySet().forEach(obj->System.out.println(obj.getKey()+":"+obj.getValue()));
		
		// Find employee with Max salary by Department // map with Object and Optional::get
		Map<String,Object> maxsalempbydept = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Employee::getSalary)),Optional::get)));
		maxsalempbydept.entrySet().forEach(obj->System.out.println(obj.getKey()+":"+obj.getValue()));
		
		 //3. Find second Max salary
		int secondMaxSal = empList.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).skip(1).findFirst().get().getSalary();
		System.out.println(secondMaxSal);
		
		 //4. Find second Max salary by department
		Map<String,Integer> secMaxSalByDept = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment,
				Collectors.collectingAndThen(Collectors.toList(), list->list.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).skip(1).findFirst().get().getSalary())));
		secMaxSalByDept.entrySet().forEach(obj->System.out.println(obj.getKey()+":"+obj.getValue()));

		 //5. Find nth highest salary consider n = 3
		int n =3;
		int nthHighest = empList.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).skip(n-1).findFirst().get().getSalary();
		System.out.println(nthHighest);
		
		// Find nth highest salary and employee n=3
		Map.Entry<Integer,List<Employee>> nthHighSalEmplist = empList.stream()
				.collect(Collectors.groupingBy(Employee::getSalary)).entrySet().stream().sorted(Comparator.comparing(it -> it.getKey())).toList().get(n);
		
		System.out.println(nthHighSalEmplist.getKey());
		
		//6. Average salary 
		Double avgSal = empList.stream().collect(Collectors.averagingInt(Employee::getSalary));
		
		System.out.println(avgSal);
		
		//7. Average salary by dept
		Map<String,Double> avgSalByDept = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingInt(Employee::getSalary)));
		avgSalByDept.entrySet().forEach(obj->System.out.println(obj.getKey()+":"+obj.getValue()));
		
		//8. find count of employee by age more than 30
		Long count = empList.stream().filter(obj->obj.getAge()>30).collect(Collectors.counting());
		System.out.println(count);

		// List of employee by age more than 30 
		Map<Boolean,Long> map =  empList.stream().collect(Collectors.partitioningBy(obj -> obj.getAge() > 30,Collectors.counting()));
		Map<Boolean,List<Employee>> result = empList.stream().collect(Collectors.partitioningBy(obj->obj.getAge()>30,Collectors.toList()));
		
		//9. Department names
		List<String> deptNames = empList.stream().map(Employee::getDepartment).distinct().collect(Collectors.toList());
		List<String> deptNames1 = empList.stream().map(Employee::getDepartment).distinct().toList();
		
		System.out.println(deptNames.toString());
		System.out.println(deptNames1.toString());
		
		// Convert list to Map
        Map<Integer, String> result3 = empList.stream().collect(
                Collectors.toMap(x -> x.getEmpId(), x -> x.getName()));
        
        System.out.println(result3);
	}

}
