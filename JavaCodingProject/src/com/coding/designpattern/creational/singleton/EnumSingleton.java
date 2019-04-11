package com.coding.designpattern.creational.singleton;

/*
 * To overcome reflection we use enum
 * 
 * Java ensures that enum is instantiated only once in a java program
 * 
 * drawback: not flexible
 * */
public enum EnumSingleton {
	INSTANCE;
	
	public static void doSomething() {
		
	}
	
}
