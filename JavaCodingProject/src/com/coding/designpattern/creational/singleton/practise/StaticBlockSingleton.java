package com.coding.designpattern.creational.singleton.practise;

public class StaticBlockSingleton {
	
	private static StaticBlockSingleton instance;
	
	private StaticBlockSingleton() {}
	
	static {
		try {
		instance= new StaticBlockSingleton();
		}catch(Exception e) {
			throw new RuntimeException("Error while creating singleton instance");
		}
	}
	
	public static StaticBlockSingleton getInstance() {
		return instance;
	}
	
}
