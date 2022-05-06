package com.coding.basic.collection;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> capitalCities=new HashMap<String, String>();
	    capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");	
	    for(String i:capitalCities.keySet()) {
	    	System.out.println(i);
	    }
	    
	 // Print values
	    for (String i : capitalCities.values()) {
	      System.out.println(i);
	    }
	    for (String i : capitalCities.keySet()) {
	    	  System.out.println("key: " + i + " value: " + capitalCities.get(i));
	    }
	    
	    capitalCities.forEach((k, v) -> {
	    	System.out.println("key : " + k + ", value : " + v);
	    });
	}

}
