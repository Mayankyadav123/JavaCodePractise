package com.coding.basic.sorting.comparator;

import java.util.Comparator;

import com.coding.basic.sorting.comparator.SortEmployee.Employee;

public class NameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
