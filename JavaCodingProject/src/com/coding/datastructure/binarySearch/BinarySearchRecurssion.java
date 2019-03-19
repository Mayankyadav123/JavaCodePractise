package com.coding.datastructure.binarySearch;

import java.util.Scanner;

public class BinarySearchRecurssion {

	
	public static int binarySearch(int arr[],int l,int h,int key) {
		if(l>=h) {
			if(arr[h]==key) {
				return h;
			}else {
			return -1;
			}
		}
		int mid=0;
		mid=(l+h)/2;
		
		if(arr[mid]==key) {
			return mid;
		}
		if(arr[mid]<key) {
			l=mid+1;
		}else {
			h=mid-1;
		}
		return binarySearch(arr, l, h, key);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[]= {1,12,23,24,35,36,47,58,120};
		Scanner in = new Scanner(System.in);
		System.out.println("Enter no. of elements");
		int n= in.nextInt();
		int[] arr= new int[n];
		System.out.println("Enter "+n+" elements");
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
		}
		System.out.println("Enter the no. you want to search");
		int key=in.nextInt();
		int l=0; 
		int h =n-1;
		int result=binarySearch(arr,l,h,key);
		if(result!=-1) {
			System.out.println(result);			
		}else {
			System.out.println("Number not found");			
		}
	}

}
