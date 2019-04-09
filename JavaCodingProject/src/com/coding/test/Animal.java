package com.coding.test;

abstract class Animal {
	 public int energy;
	 public int makeSound() {
		System.out.println("Default: make sound");
		energy=energy-3;
		return energy;
	}
	 public int eatFood() {
		System.out.println("Default: eat food");
		energy=energy+5;
		return energy;
	}
	 public int sleep() {
		System.out.println("Default: sleep");
		energy=energy+10;
		return energy;
	}
	 public int currentEnergyLevel() {
		 System.out.println(energy);
		 return energy;
	 }
	 
}


