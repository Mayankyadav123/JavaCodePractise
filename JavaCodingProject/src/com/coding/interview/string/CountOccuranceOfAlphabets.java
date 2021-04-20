package com.coding.interview.string;

import java.util.HashMap;
import java.util.Map;

public class CountOccuranceOfAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "abc abc";
		char[] chars=s.toCharArray();
		HashMap<Character, Integer> list=new HashMap<Character, Integer>();
		for(char c:chars) {
			if(list.containsKey(c)) {
				list.put(c, list.get(c)+1);
			}else {
				list.put(c, 1);
			}
			
		}
		for(Map.Entry e:list.entrySet()) {
			System.out.println(e.getKey()+":"+e.getValue());
		}
		list.forEach((k,v)->System.out.println(k+":"+v));
	}

}
