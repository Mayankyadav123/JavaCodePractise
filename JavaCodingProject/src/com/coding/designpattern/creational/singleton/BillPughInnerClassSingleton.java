package com.coding.designpattern.creational.singleton;

/*
 * Better than thread safe approach when too many threads try to access
 * 
 * Made inner static helper class
 * 
 * SingletonInnerHelper only loaded in memory when getInstance() is called
 * */
public class BillPughInnerClassSingleton {

	private BillPughInnerClassSingleton() {}
	
	private static class SingletonInnerHelper{
		private static final BillPughInnerClassSingleton instance=new BillPughInnerClassSingleton();
	}
	
	public static BillPughInnerClassSingleton getInstance() {
		return SingletonInnerHelper.instance;
	}
}
