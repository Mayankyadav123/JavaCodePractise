package com.coding.basic.concept.polymorphism;

//overriding concepts
/**
 * P p = new C();
 * if method exists in child then child method will be called
 * Basically upcasting i.e parent reference object and then using child method and have access to parent variables
 * If parent is trying to access a method jo sirf child me hai then it will not be able to access it
 * */
public class RuntimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal horse=new Horse();
		Animal cat=new Cat();
		
		// Horse h= new Animal(); is invalid i.e child can't hold parent reference
		horse.sound(); // this will work because child will override the parent sound method
		cat.sound();
		// horse.run();
		// Run method sirf child class me hai aur parent reference hai isliye parent ko access nhi milega
		// This is giving error because we can use parent reference to call child class object
		// but we can call only the methods available in parent class.
		
	}

}
