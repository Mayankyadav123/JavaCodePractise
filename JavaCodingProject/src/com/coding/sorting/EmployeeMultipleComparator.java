package com.coding.sorting;

import java.util.Comparator;

public class EmployeeMultipleComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		int compareId=e1.getId()>e2.getId()?1:-1;
		if(e1.getId()==e2.getId()) {
			compareId=0;
		}
		if(compareId!=0) {
			return compareId;
		}
		
		int age=e1.getAge().compareTo(e2.getAge());
		if(age!=0) {
			return age;
		}
		
		return 0;
	}

}
