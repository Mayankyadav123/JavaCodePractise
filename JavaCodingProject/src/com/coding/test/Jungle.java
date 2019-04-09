package com.coding.test;

import java.util.HashMap;

public class Jungle {

	private static HashMap<Animal,Integer> animalMap=new HashMap<Animal, Integer>();
	
	public static void checkType(Object obj) {
		
	}
	
	public static void soundOff() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Snake s = new Snake();
		Snake s1 = new Snake();
		s.sleep();
		s.currentEnergyLevel();
		Monkey m= new Monkey();
		m.sleep();
		m.currentEnergyLevel();
		m.makeSound();
		m.currentEnergyLevel();
		s.currentEnergyLevel();
		animalMap.put(s, 1);
		animalMap.put(s1, 2);
		animalMap.put(s, 2);
		System.out.println(animalMap.toString());


	}

}
