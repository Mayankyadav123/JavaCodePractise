package com.coding.basic.collection;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("1");
		ts.add("2");
		ts.add("3");
		
		ts.add("1");
		System.out.println(ts);
	}

}
