package com.coding.designpattern.creational.singleton;

/*
 * 2 ways 
 * 1. make method synchronized
 * 2. make synchronized block for only required line of instruction
 * ->Double checking locking
 * 
 * */
public class ThreadSafeSingleton {

	private static ThreadSafeSingleton instance;
	
	private ThreadSafeSingleton() {}
	
	public static synchronized ThreadSafeSingleton getInstance() {
		if(instance==null) {
			instance=new ThreadSafeSingleton();
		}
		return instance;
	}
	
	public static ThreadSafeSingleton getInstanceBlock() {
		if(instance==null) {
			synchronized (ThreadSafeSingleton.class) {
				if(instance==null) {
					instance=new ThreadSafeSingleton();
				}
			}
		}
		return instance;
	}
}
