package com.coding.designpattern.creational.singleton.practise;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionDestroySingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EagerInitializationSingleton instanceOne=EagerInitializationSingleton.getInstance();
		EagerInitializationSingleton instanceTwo=null;
		
		Constructor[] constructors=EagerInitializationSingleton.class.getDeclaredConstructors();
		
		for(Constructor constructor: constructors) {
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
