package com.coding.designpattern.creational.singleton.practise;

public class ThreadSafeSingleton {
	
	private static ThreadSafeSingleton instance;
	
	private ThreadSafeSingleton() {}
	
	public static synchronized ThreadSafeSingleton getInstance() {
		if(instance==null) {
			instance= new ThreadSafeSingleton();
		}
		return instance;
		
	}
	
	public static ThreadSafeSingleton getInstanceBlock() {
		if(instance==null) {
			synchronized (ThreadSafeSingleton.class) {
				if(instance==null) {
					instance= new ThreadSafeSingleton();
				}
			}
		}
		return instance;
	}

}
