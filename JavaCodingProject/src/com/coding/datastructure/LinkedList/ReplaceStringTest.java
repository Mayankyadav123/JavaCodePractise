package com.coding.datastructure.LinkedList;

import java.util.Scanner;

public class ReplaceStringTest {

	public static String replace(String s) {
		String newString="";
		
		for(int i=0;i<s.length();i++) {
			int val=s.charAt(i);
			System.out.println(val);
			int newVal=val+25;
			if(newVal>122) {
				newVal=122-val+97;
			}
			newString+=(char)(newVal);
			System.out.println(newVal);
			System.out.println((char)(newVal));
		}
		return newString;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		String s=in.next();
		String result=replace(s);
		System.out.println(result);
	}

}
