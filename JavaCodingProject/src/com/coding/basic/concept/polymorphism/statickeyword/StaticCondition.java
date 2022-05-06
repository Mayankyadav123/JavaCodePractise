package com.coding.basic.concept.polymorphism.statickeyword;

/*
 * Overriding concept
 * if parent has a static method then it will always hide childs static method
 * whatever may be the reference
 * 
 * Overloading concept
 * static method can be overloaded
 * if parent reference we can't call childs static reference
 * child reference can call both static methods with parent and child
 */
class Parent1 {
	
	public void nonStaticParentMethod() {
		System.out.println("Called from parent");
	}
	
	public static void overloadingParent() {
		System.out.println("Called from parent");
	}
	
	
}

class Child1 extends Parent1 {
	
	public static void nonStaticParentMethod() {
		System.out.println("Called from child");
	}
	
	public static void overloadingParent(int a) {
		System.out.println("Called from child:"+a);
	}
	
	
}

public class StaticCondition {
	public static void main(String[] args) {
		
		Parent1 p= new Child1();
		p.nonStaticParentMethod();// this will work and call parents method
		// p.overloadingParent(12); // this will not work because parent reference can't access childs methods
		// Parent1.overloadingParent(22); // this will not work because parent doesn't have access to childs static method
		Child1 c = new Child1();
		c.overloadingParent(10); // this will work 
		Child1.overloadingParent(20);
		Child1.overloadingParent();// child will have access to parents static reference
		// c.nonStaticParentMethod(); this will give compilation error
		// Child1.nonStaticParentMethod(); this will give compilation error
		
	}

}
