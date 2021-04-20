package com.coding.designpattern.creational.abstractfactorypattern;

import java.util.TreeSet;

public class Dummy extends Hack implements int1,int2 {


	public Dummy(String Hack) {
		a=2;// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println(i);
		
//		
//	byte a=6;
//	byte b=10;
//	System.out.println((b%a)+", ");
//	System.out.println(b==((b/a)*a+(b%a)));
		
//		int val[10];
//		System.out.println(val[1]);

//		int val=5;
//		while(val<10) {
//			System.out.println(val+" ");
//			val++;
//		}
		
		
//		Dummy d=new Dummy();
//		d.output();
		
		TreeSet<StringBuffer> t=new TreeSet<StringBuffer>();
		t.add(new StringBuffer("H"));
		t.add(new StringBuffer("E"));

	}
	
	public class Hack{
		public int a=0;

		public Hack(int a) {
			a = a;
		}
		
	}
	
	void output() {
		long[] x= {7,8,9};
		long[] y=fix(x);
		System.out.println(x[0]+x[1]+x[2]+" ");
		System.out.println(y[0]+y[1]+y[2]);
	}

	long[] fix(long[] z) {
		z[1]=4;
		return z;
	}
}
interface int1{
	int i=0;
}
interface int2{
	int i=0;
}
