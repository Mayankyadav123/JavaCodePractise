package com.coding.threading;

public class Deadlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharedResource resources= new SharedResource("resource1", "resource2");
		
	}
}

class SharedResource{
	String resource1=null;
	String resource2=null;
	public SharedResource(String resource1,String resource2) {
		super();
		this.resource1=resource1;
		this.resource2=resource2;
	}
}
