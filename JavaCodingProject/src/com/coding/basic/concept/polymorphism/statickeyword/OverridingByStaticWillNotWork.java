package com.coding.basic.concept.polymorphism.statickeyword;

public class OverridingByStaticWillNotWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// when reference of parent is taken then static of parent hides staic method of child
		Parent c=new Child();
		c.print();
		c.display();
		c.parentwithStatic();
		c.childwithStatic();
		//if we make reference of child then static of child is considered
		Child c1=new Child();
		c1.print();
		c1.display();
		//this will give compilation error
		//because non-static method of child cannot override static method of parent class 
		
		//c1.parentwithStatic();
		
		//this will give compilation error
		//	This static method cannot hide the instance method from Parent
//Error 2		c1.childwithStatic();
	}

}

class Parent {
	//when both parent and child have static
	public static void display() {
		System.out.println("static or class method of parent is called");
	}
	
	public void print() {
		System.out.println("parent print called");
	}
	
	public static void parentwithStatic() {
		System.out.println("static or class method of parent is called :parentwithStatic" );
	}
	
	public  void childwithStatic() {
		System.out.println("static or class method of parent is called :childwithStatic" );
	}
}

class Child extends Parent{
	
	// this will not get called as a static method is already present
	// and it will hide the display of child method
	public static void display() {
		System.out.println("static or class method of child called");
	}
	
	public void print() {
		System.out.println("child print called");
	}
	
	
	public void parentwithStatic() {
		System.out.println("static or class method of child is called :parentwithStatic" );
	}
	
	public static  void childwithStatic() {
		System.out.println("static or class method of child is called :childwithStatic" );
	}
}