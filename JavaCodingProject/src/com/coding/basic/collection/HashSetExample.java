
package com.coding.basic.collection;

import java.util.HashSet;

public class HashSetExample {
	
	public static void main(String args[]) {
		HashSet<String> h=new HashSet<String>();
		h.add("India"); 
        h.add("Australia"); 
        h.add("South Africa"); 
        h.add("India");
        
        System.out.println(h);
        h.remove("India");
        System.out.println(h);
	}

}
