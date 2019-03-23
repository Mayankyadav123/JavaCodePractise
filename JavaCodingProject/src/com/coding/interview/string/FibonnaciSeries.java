package com.coding.interview.string;

import java.util.Scanner;

public class FibonnaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int a=0,b=0,c=1;
		for(int i=0;i<num;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.println(a+" ");
		}
	}

}
