package com.coding.basic.collection;

import java.util.Hashtable;

public class HashTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, String> h=new Hashtable<Integer, String>();
		Hashtable<Integer, String> h1=new Hashtable<Integer, String>();

        h.put(3, "Geeks"); 
        h.put(2, "forGeeks"); 
        h.put(1, "isBest"); 
        
        h1=(Hashtable<Integer, String>) h.clone();
        System.out.println("values in clone: " + h1); 
        h.clear(); 
        System.out.println("after clearing: " + h); 

        
	}

}
