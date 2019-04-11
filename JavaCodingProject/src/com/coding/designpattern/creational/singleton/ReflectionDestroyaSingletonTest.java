package com.coding.designpattern.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
// by giving access to constructor and creating new Instance we get two different
// object instances
public class ReflectionDestroyaSingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EagerInitializationSingleton instanceOne=EagerInitializationSingleton.getInstance();
		EagerInitializationSingleton instanceTwo =null;
		Constructor[] constructors=EagerInitializationSingleton.class.getDeclaredConstructors();
		for(Constructor<?> constructor:constructors) {
			//this destroys singleton as constructor is now access
			constructor.setAccessible(true);
			
			try {
				instanceTwo=(EagerInitializationSingleton)constructor.newInstance();
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());

	}

}
