package com.coding.test;

abstract class Animal {
	 public int energy=10;
	 public int makeSound() {
		if(energy>=3) {
			System.out.println("Default: make sound :energy-3");
		energy=energy-3;
		}else {
			System.out.println("Not sufficient Energy");
		}
		return energy;
	}
	 public int eatFood() {
		System.out.println("Default: eat food :energy+5");
		energy=energy+5;
		return energy;
	}
	 public int sleep() {
		System.out.println("Default: sleep :energy+10");
		energy=energy+10;
		return energy;
	}
	 public int currentEnergyLevel() {
		 System.out.println("Current Energy Level:"+energy);
		 return energy;
	 }
	 
}


