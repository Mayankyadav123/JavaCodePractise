package com.coding.interview.string;

public class ReverseString {
//total 4 ways
	public static void main(String args[]) {
		String txt="Repeat the string";
		String result=null;
		//result=inbuild(txt);
		//result=charBased(txt);
		//result=splitBased(txt); 
		result=charAtBased(txt);
		System.out.println(result);
	}
	
	public static String inbuild(String txt) {
		StringBuilder str=new StringBuilder();
		str.append(txt);
		str=str.reverse();
		return str.toString();
	}
	
	public static String charBased(String txt) {
		char chars[]=txt.toCharArray();
		String str="";
		for(int i=chars.length-1;i>=0;i--) {
			str=str+""+chars[i];
		}
		return str;
	}
	
	public static String splitBased(String txt) {
		String[] str =txt.split("");
		String result="";
		for(int i =str.length-1;i>=0;i--) {
			result=result+""+str[i];
		}
		return result;
	}
	
	public static String charAtBased(String txt) {
		String reverse="";
		for(int i=txt.length()-1;i>=0;i--) {
			reverse=reverse+""+txt.charAt(i);
		}
		return reverse;
	}
	
}
