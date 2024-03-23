package com.coding.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class MapQuestion {

	public static void main(String args[]) {
		// HashMap Sorting questions
		// TreeMao maintains sorted order
		// NavigableMap subpart of treeMap for sorted Maps with descending values

		// For Natural Sorting ASEC
		Map<Integer, String> map = new HashMap<>();
		map.put(10, "ABC");
		map.put(5, "dhf");
		map.put(6, "sdasf");
		map.put(1, "jhk");
		map.put(2, "sdf");
		map.put(3, "sdaf");
		map.put(4, "dfgqwe");
		
		//Sort By Employee
		Map<Employee, Integer> empMap = new HashMap<>();
		empMap.put(new Employee(2,"E2", 21, "DEP2", 2000), 2);
		empMap.put(new Employee(1,"E1", 20, "DEP1", 1000), 1);
		empMap.put(new Employee(4,"E4", 40, "DEP4", 4000), 4);
		empMap.put(new Employee(3,"E3", 30, "DEP3", 3000), 3);
		
		empMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getDepartment))).forEach(System.out::println);
		empMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getDepartment).reversed())).forEach(System.out::println);
		
		List<Entry<String,Integer>> entries = new ArrayList<Map.Entry<Strisng,Integer>>();
		Collections.sort(entries,new Comparator<Entry<String,Integer>>() {
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getKey().compareTo(o2.getKey());
			}
		});
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		

		// TreeMap
		TreeMap<Integer, String> map1 = new TreeMap<Integer, String>();
		map1.put(100, "Amit");
		map1.put(102, "Ravi");
		map1.put(101, "Vijay");
		map1.put(103, "Rahul");
		map1.put(99, "Rahul");

		for (Map.Entry m : map1.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		// NavigableMap
		NavigableMap<Integer, String> map2 = new TreeMap<Integer, String>();
		map2.put(100, "Amit");
		map2.put(102, "Ravi");
		map2.put(101, "Vijay");
		map2.put(103, "Rahul");
		// Maintains descending order
		System.out.println("descendingMap: " + map2.descendingMap());
		
		SortedMap<Integer, String> map3 = new TreeMap<Integer, String>();
		map3.put(100, "Amit");
		map3.put(102, "Ravi");
		map3.put(101, "Vijay");
		map3.put(103, "Rahul");
		//Maintain ascending/Natural order
		for (Map.Entry m : map3.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}
}
