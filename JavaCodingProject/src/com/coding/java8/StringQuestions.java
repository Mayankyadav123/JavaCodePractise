package com.coding.java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringQuestions {
	
	public static void main(String args[]) {
		
		String str = "Geek for Geeks";
		
		//1. Find duplicate occurance
		
		Map<String,Long> result=Arrays.stream(str.split("")).map(String::toLowerCase).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		result.entrySet().forEach(obj->System.out.println(obj.getKey()+":"+obj.getValue()));
		
		
		Map<String,Long> result1 = Arrays.stream(str.split("")).map(String::toLowerCase).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		result1.entrySet().forEach(obj->System.out.println(obj.getKey()+":"+obj.getValue()));

	}

}
