package com.coding.test;

public class Tiger extends Animal {

	public int sleep() {
		System.out.println("Tiger Sleep :energy+5");
		energy=energy+5;
		return energy;
	}
	
	
	public void eatFood(String food) {
		if(!food.equalsIgnoreCase(Food.grain.toString())) {
			System.out.println("Tiger eatFood :energy+5");
			energy=energy+5;
		}else {
			System.out.println("can't eat: sensitive digestion");
		}
	}

}
