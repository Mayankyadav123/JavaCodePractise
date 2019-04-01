package com.coding.basic.concept.polymorphism;

public class RuntimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal horse=new Horse();
		Animal cat=new Cat();
		horse.sound();
		cat.sound();
	}

}
