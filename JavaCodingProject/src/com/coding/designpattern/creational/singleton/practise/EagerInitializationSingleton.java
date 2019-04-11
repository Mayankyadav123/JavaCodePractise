package com.coding.designpattern.creational.singleton.practise;

public class EagerInitializationSingleton {
	
	private static final EagerInitializationSingleton instance= new EagerInitializationSingleton();
	
	private EagerInitializationSingleton() {}
	
	public static EagerInitializationSingleton getInstance() {
		return instance;
	}
}
