package com.coding.basic.concept.polymorphism.statickeyword;

public class OverloadbystaticWillNotWork {

	public static void foo() {
		System.out.println("static Foo called");
	}
	
	// this will not work 
	//Compile Error: cannot redefine foo
	//In eclipse it is running because
	//You've got a special case here. The compiler is able to 
	//compile the first occurance of the method but later comes across the duplicate method 
	//that can't be added to the class. Because the first method is already compiled and 
	//when you enforce the starting of the class despite the warning you see the regular method
	//that was successfully compiled in action.
	
	
	public void foo() {
		System.out.println("foo called");
	}
	
	public static void main(String args[]) {
		OverloadbystaticWillNotWork.foo();
	}
}
