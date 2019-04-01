package com.coding.basic.collection;


import java.util.Arrays;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] names= {"a","b","c","d"};
		//Arrays are fixed size and immutable i.e can't add or delete in the array
		List<String> names=Arrays.asList("a","b","c","d");
		names.stream().filter(name->"a".equalsIgnoreCase(name)).forEach(System.out::println);
	}

}
