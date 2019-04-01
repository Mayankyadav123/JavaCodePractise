package com.coding.basic.concept.polymorphism;

public class CompileTimePolymorphism {

	public int Sum(int a,int b) {
		return (a+b);
	}
	
	public int Sum(int a,int b,int c) {
		return (a+b+c);
	}
	
	public double Sum(double a,double  b) {
		return (a+b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompileTimePolymorphism cp=new CompileTimePolymorphism();
		System.out.println(cp.Sum(1, 2));
		System.out.println(cp.Sum(1, 2,3));
		System.out.println(cp.Sum(1.8, 2.4));

	}

}
