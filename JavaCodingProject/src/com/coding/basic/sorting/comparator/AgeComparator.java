package com.coding.basic.sorting.comparator;

import java.util.Comparator;

import com.coding.basic.sorting.comparator.SortEmployee.Employee;

public class AgeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e1.getAge() - e2.getAge();
	}

}
