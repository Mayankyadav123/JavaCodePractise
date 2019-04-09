package com.coding.test;

public class Snake extends Animal{

	@Override
	public String toString() {
		return "Snake [energy=" + energy + ", makeSound()=" + makeSound() + ", eatFood()=" + eatFood() + ", sleep()="
				+ sleep() + ", currentEnergyLevel()=" + currentEnergyLevel() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}


}
