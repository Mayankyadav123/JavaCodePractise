package com.coding.test;

abstract class Animal {
	String animalType="";
	int animalCount=0;
	
	 public int makeSound(int energy) {
		System.out.println("Animal make sound");
		return energy-3;
	}
	 public int eatFood(int energy) {
		System.out.println("Animal eat food");
		return energy+5;
	}
	 public int sleep(int energy) {
		System.out.println("Animal make sound");
		return energy+10;
	}
}
