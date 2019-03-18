package com.coding.datastructure.binarySearch;

public class BinarySearchRecurssion {

	
	public static int BinarySearch(int arr[],int l,int h,int key) {
		if(l>h) {
			return -1;
		}
		int mid=0;
		mid=(l+h)/2;
		
		if(key==arr[mid]) {
			return mid;
		}
		if(key>arr[mid]) {
			l=mid+1;
		}
		if(key<arr[mid]) {
			h=mid-1;
		}
		return BinarySearch(arr, l, h, key);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,12,23,24,35,36,47,58,120};
		int l=0; 
		int h = arr.length-1;
		int key=35;
		int result=BinarySearch(arr,l,h,key);
		System.out.println(result);
	}

}