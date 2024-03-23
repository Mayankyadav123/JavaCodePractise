package com.coding.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringDuplicateQuestion {
	
	public static void main(String args[]) {
		//duplicate word occurance
		String str = "Hello world program Hello";
		String[] strArry = str.split(" ");
		List<String> list = Arrays.asList(strArry);
		Map<String,Long> result = list.stream().map(str1 -> str1).collect(Collectors.groupingBy(str1->str1,Collectors.counting()));
	
		//result.entrySet().forEach(obj->System.out.println(obj.toString()));
		result.forEach((k,v)-> System.out.println(k+":"+v));
	}

}
