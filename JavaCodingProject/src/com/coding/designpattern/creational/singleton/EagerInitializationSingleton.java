package com.coding.designpattern.creational.singleton;

//Singleton=>
//one and only instance of class
//a global single point of access
/*
 * Contains
 * private constructor
 * private instance
 * public method to access
 * */

//not good
//Singleton created at time of class loading

//drawback: 
// 1. instance is created even though client might not be using it
// 2. No exception handling
public class EagerInitializationSingleton {

		private static final EagerInitializationSingleton instance=new EagerInitializationSingleton();
		
		//private constructor to avoid client application to use constructor
		private EagerInitializationSingleton() {
			
		}
		
		public static EagerInitializationSingleton getInstance() {
			return instance;
		}
		
}
