package com.coding.java8;
// same default method in 2 interfaces Example Frog
public class DiamondProblem {

	public static void main(String... args) {
		// TODO Auto-generated method stub

	}

}


interface Animal {

}

interface AquaticAnimal extends Animal{
	
	default void livesin() {
		System.out.println("Lives in water");
	}
	
	
}

interface LandAnimal extends Animal{
	
	default void livesin() {
		System.out.println("Lives on Land");
	}
}

class Frog implements  AquaticAnimal,LandAnimal{

	// compiler will give error as it doesn't know which interface default we wish to call
	// so we need to override common default method and do interface.super.method() call
	@Override
	public void livesin() {
		// TODO Auto-generated method stub
		AquaticAnimal.super.livesin();
	//	LandAnimal.super.livesin();
	}
	
}




