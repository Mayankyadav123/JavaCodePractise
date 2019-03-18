package com.coding.datastructure;

public class BinarySearch {

	public static int BinarySearch(int arr[],int key) {
		int l=0;
		int h=arr.length;
		int mid=0;
		while(l<=h) {
		mid=(l+h)/2;
		if(arr[mid]==key) {
			return mid;
		}
		if(arr[mid]>key) {
			h=mid-1;
		}
		if(arr[mid]<key) {
			l=mid+1;
		}
		}
		return -1;
	}
	
	public static void main(String args[]) {
		int arr[]= {1,12,23,24,35,36,47,58,120};
		int result=BinarySearch(arr,120);
		System.out.println(result);
	}
}

