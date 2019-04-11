package com.coding.test;

public class Monkey extends Animal implements Iplay{
	
	public int eatFood() {
		System.out.println("monkey eat food :energy+2");
		energy=energy+2;
		return energy;
	}
	public int makeSound() {
		if(energy>=4) {
			System.out.println("monkey make sound :energy-4");
		energy=energy-4;
		}else {
			System.out.println("not sufficient energy");
		}
		return energy;
	}
	@Override
	public int play(String say) {
		// TODO Auto-generated method stub
		if(say.equals("Oooo Oooo Oooo") && (energy-8)>0) {
			System.out.println("Monkey is playing -8");
			energy=energy-8;
		}else {
			System.out.println("Monkey is too tired");
		}
		return energy;

	}


}
