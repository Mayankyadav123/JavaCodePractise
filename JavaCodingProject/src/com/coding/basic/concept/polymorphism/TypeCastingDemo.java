package com.coding.basic.concept.polymorphism;


class Parent {
	
	protected int x=10;
	int y=10;

	
	public void Method1() {
		System.out.println("Parent Method x:"+x);
	}
}

class Child extends Parent {
	int x=30;
	private int y=30;
	
	@Override
	public void Method1() {
		System.out.println("Child Method x:"+x);
	}
	
	public void Method2() {
		System.out.println("Child Method x:"+x);
		System.out.println("call super for Parent x:"+super.x);
	}
}

public class TypeCastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Child();
		p.Method1();//child method
		System.out.println(p.x);//parent class member/variables 
		System.out.println(p.y);//parent class member/variables
		
		Child c = (Child)p;
		c.Method1();
		c.Method2();
		System.out.println(c.x); // 30 after downcasting to child
		//System.out.println(c.y); // Child.y is not visible 
		
		Parent p1 =(Parent) new Child();
		p1.Method1();
		System.out.println(p1.x);//parent class member/variables 
		
	}

}
