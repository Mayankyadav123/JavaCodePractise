package com.coding.test;

public class Tiger extends Animal {
	private int tEnergy;

	public Tiger(int tEnergy) {
		super();
		this.tEnergy = tEnergy;
	}

	public int sleep(int energy) {
		tEnergy=energy+5;
		return tEnergy;
	}
	
	public int eatFood(String foodType,int energy) {
		if(!foodType.equalsIgnoreCase("grain")) {
			tEnergy=energy+5;
		}else {
			System.out.println("can't eat: sensitive digestion");
		}
		return tEnergy;
	}
}
