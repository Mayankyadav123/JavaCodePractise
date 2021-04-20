package com.coding.interview.string;

public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] s1= {1,2,3,4,5,6,7,8,9,10};
		String[] s2= {"a","b","c","d","e","f","g","h"};
		String s3= "";
		int index=0;
		for(int i=0;i<s2.length-1;i++) {
			System.out.println(" ");
			for(int j=0;j<=i;j++) {
				System.out.print(s2[index]);
			s3=s3+s2[index];
			for(int k=j;k<=j;k++) {
				System.out.print(s1[index]);
			}
		    index++;
			}
			
			
//			System.out.println("");
//			for(int j=0;j<=i;j++) {
//				if(index<s2.length-1)
//				System.out.print(s2[index]);
//			}
//			for(int j=0;j<=i;j++) {
//				if(index<s1.length-1)
//				System.out.print(s1[index]);
//			}
//			index++;
//			for(int j=i;j<=i;j++) {
//				for(int k=0;k<s1.length;k++) {
//					index++;
//					System.out.println(s3);	
//				}
//			}
		}
		System.out.println(s3);
	}
	

	


}
