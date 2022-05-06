package com.coding.datastructure.binarySearch;

import java.util.Scanner;

public class BinarySearchRepeatedElement {

	public static int bs(int[] arr,int key,boolean searchfirst) {
		int result=-1;
		int l=0;
		int h=arr.length-1;
		while(l<=h) {
			int mid=(l+h)/2;
			if(arr[mid]==key) {
				result=mid;
				if(searchfirst) {
					h=mid-1;
				}else {
					l=mid+1;
				}
			}
			if(key>arr[mid]) {
				l=mid+1;
			}
			if(key<arr[mid]){
				h=mid-1;
			}
		}
		return result;
	}
	
	public static void main(String args[]) {
		int arr[]= {1,2,2,4,5,6,6,6,8,8,10,11};
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the value to search");
		int key=in.nextInt();
		int first=bs(arr,key,true);
		int last=bs(arr,key,false);
		int count = 0;
		if(first>0 && last>0) {
		count=last-first+1;			
		}
		System.out.println("total count of "+key+":"+count);
	}
}
