package com.coding.basic.hashcode;

public class HashcodeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student alex1 = new Student(1, "Alex");
        Student alex2 = new Student(1, "Alex");
        System.out.println("alex1 hashcode = " + alex1.hashCode());

        System.out.println("alex2 hashcode = " + alex2.hashCode());
        System.out.println(alex1.equals(alex2));
	}

}
