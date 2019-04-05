package com.coding.basic.collection;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       LinkedHashSet<String> linkedset =  
                   new LinkedHashSet<String>();   
	       linkedset.add("A");   
	        linkedset.add("B");   
	        linkedset.add("C");   
	        linkedset.add("D");
	        
	        linkedset.add("A");  
	        linkedset.add("E");  
	        System.out.println(linkedset);
	}

}
