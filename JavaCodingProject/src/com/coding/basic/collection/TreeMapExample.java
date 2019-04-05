package com.coding.basic.collection;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,Double> tm=new TreeMap<String, Double>();
		 tm.put("Head First Java", 807.34); 
	        tm.put("Java: A Beginners Guide 6th "+ 
	                "Edition", 593.05); 
	        tm.put("Java: The Complete Reference"+  
	                 " 9th Edition", 531.31); 
	        tm.put("Core Java Volume I_Fundamentals"+ 
	                " 9th Edition", 544.34); 
	        tm.put("Effective Java 2nd Edition", 373.70); 
	        tm.put("Java 8 in action", null); 
	        tm.put("Java 8 in action", 539.65); 
	        Set<Map.Entry<String,Double>> set=tm.entrySet();
	        for(Map.Entry<String, Double> me:set) {
	        	System.out.println(me.getKey()+":"+me.getValue());
	        }
	}

}
