package com.coding.test;

public class Monkey extends Animal implements Iplay{

	public int eatFood() {
		energy=energy+2;
		return energy;
	}
	public int makeSound() {
		System.out.println("monkey make sound");
		energy=energy-4;
		return energy;
	}
	@Override
	public int play(int energy,String say) {
		// TODO Auto-generated method stub
		if(say.equals("Oooo Oooo Oooo") && (energy-8)>0) {
			System.out.println("Monkey is playing");
			energy=energy-8;
		}else {
			System.out.println("Monkey is too tired");
		}
		return energy;

	}
	@Override
	public int currentEnergyLevel() {
		// TODO Auto-generated method stub
		System.out.println(energy);
		return energy;
	}

}
