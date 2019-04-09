package com.coding.test;

import java.util.HashMap;
import java.util.List;

public class Jungle {

	private static HashMap<String,List<Animal>> animalMap=new HashMap<String,List<Animal>>();
	
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
		animalMap.put("Snakes", (List<Animal>) s);
		
		System.out.println(animalMap.toString()); 


	}

}
