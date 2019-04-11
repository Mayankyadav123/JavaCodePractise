package com.coding.designpattern.creational.singleton;


/*
 * Good for Single-threaded environment
 * 
 * Breaks in multi-threaded environment
 * both threads will have different instance in case of race condition
 * 
 * */
public class LazyInitializedSingleton {

		private static LazyInitializedSingleton instance;
		
		private LazyInitializedSingleton() {}
		
		private static LazyInitializedSingleton getInstance() {
			if(instance==null) {
				instance= new LazyInitializedSingleton();
			}
				return instance;
		}
		
}
