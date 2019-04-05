package com.coding.test;

public class Monkey extends Animal implements Iplay{
	private int mEnergy;
	
	public Monkey(int mEnergy) {
		super();
		this.mEnergy = mEnergy;
	}
	public int eatFood(int energy) {
		mEnergy=energy+2;
		return mEnergy;
	}
	public int makeSound(int energy) {
		mEnergy=energy-4;
		return mEnergy;
	}
	@Override
	public int play(int energy,String say) {
		// TODO Auto-generated method stub
		if(say.equals("Oooo Oooo Oooo") && (energy-8)>0) {
			mEnergy=energy-8;
		}else {
			System.out.println("Monkey is too tired");
		}
		return mEnergy;

	}
}
