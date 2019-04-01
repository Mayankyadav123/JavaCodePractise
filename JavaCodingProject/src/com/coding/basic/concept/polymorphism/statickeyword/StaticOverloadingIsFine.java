package com.coding.basic.concept.polymorphism.statickeyword;

public class StaticOverloadingIsFine {

	public static void foo() {
		System.out.println("StaticOverloadingIsFine.foo() called");
	}
	//parameter or return type must be different
	public static void foo(int a) {
		System.out.println("StaticOverloadingIsFine.foo(int) called:"+a);
	}
	
//	even return type difference wont work in same class
//	public static int foo(int a) {
//		System.out.println("StaticOverloadingIsFine.foo(int) called:"+a);
//		return a;
//	}
	
//	public void sum(int a) {
//		System.out.println("sum called");
//	}
//	
//	public int sum(int a) {
//		System.out.println("sum(int) called");
//		return a;
//	}
//	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticOverloadingIsFine.foo();
		StaticOverloadingIsFine.foo(10);

	}

}
