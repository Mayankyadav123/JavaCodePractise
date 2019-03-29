package com.coding.datastructure.binarySearch;

import java.util.Scanner;

public class BinarySearch {

	public static int binarySearch(int arr[],int key) {
		int l=0;
		int h=arr.length-1;
		int mid=0;
		while(l<=h) {
		mid=(l+h)/2;
		if(arr[mid]==key) {
			return mid;
		}
		else if(arr[mid]>key) {
			h=mid-1;
		}
		else if(arr[mid]<key) {
			l=mid+1;
		}
		}
		return -1;
	}
	
	public static void main(String args[]) {
		//int arr[]= {1,12,23,24,35,36,47,58,120};
		Scanner in = new Scanner(System.in);
	    System.out.println("Enter number of elements");
	    int n = in.nextInt();
	    int arr[] = new int[n];
	    System.out.println("Enter " + n + " integers");
	    for(int i=0;i<n;i++)
	    	arr[i]=in.nextInt();
	    System.out.println("Enter value to search");
		int key=in.nextInt();
		int result=binarySearch(arr,key);
		System.out.println(result);
	}
}

