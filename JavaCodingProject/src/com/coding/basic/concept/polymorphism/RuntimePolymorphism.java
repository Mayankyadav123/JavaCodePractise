package com.coding.basic.concept.polymorphism;

public class RuntimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HERE we use parent type to hold the object
		//If the method is ovverriden by child it will call
		//child method
		Animal horse=new Horse();
		Animal cat=new Cat();
		
		horse.sound();
		cat.sound();
	}

}
