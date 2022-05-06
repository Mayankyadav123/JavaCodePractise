package com.coding.basic.concept.polymorphism.statickeyword;

/**
 * Static overloading is allowed
 * for overloading we must have same name and different parameter(different type or, different number or both)
 * we can't have overloading by changing return type
 * @author DELL
 *
 */
public class StaticOverloadingIsFine {

	public static void foo() {
		System.out.println("StaticOverloadingIsFine.foo() called");
	}
	//parameter must be different
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
		
		StaticOverloadingIsFine obj = new StaticOverloadingIsFine();
		obj.sum(3);
	}

}
