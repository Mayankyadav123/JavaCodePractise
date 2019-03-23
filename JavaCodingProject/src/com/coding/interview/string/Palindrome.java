package com.coding.interview.string;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int actualnum=num;
		int reversenum=0,remainder;
		while (num!=0) {
			remainder=num%10;
			reversenum=reversenum*10+remainder;
			num=num/10;//divident
		}
		if(reversenum==actualnum)
		System.out.println("It's a palindrome");
		else {
			System.out.println("Is not a palindrome");
		}
	}

}
