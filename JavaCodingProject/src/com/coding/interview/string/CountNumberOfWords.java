package com.coding.interview.string;

import java.util.HashMap;

public class CountNumberOfWords {
	
	public static void main(String args[]) {
		String txt="count this is is string";
		String[] str=txt.split(" ");
		HashMap<String,Integer> map=new HashMap<String, Integer>();
		for(int i=str.length-1;i>=0;i--) {
			if(map.containsKey(str[i])) {
				int count=map.get(str[i]);
				map.put(str[i], count+1);
			}else {
				map.put(str[i], 1);
			}
		}
		System.out.println(map);
	}
}
