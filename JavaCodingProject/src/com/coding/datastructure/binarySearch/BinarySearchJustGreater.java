package com.coding.datastructure.binarySearch;

public class BinarySearchJustGreater {

	public static int binarySearchJustGreater(int arr[],int key) {
		int l=0;
		int h=arr.length-1;
		while(l<=h) {
			int mid=(l+h)/2;
			if(key>arr[mid] && key<arr[mid+1]) {
				return mid+1;
			}
			if(key>arr[mid]) {
				l=mid+1;
			}else {
				h=mid-1;
			}
		} 
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,6,8,10,39,76};
		int key=67;
		int result=binarySearchJustGreater(arr,key);
		System.out.println(result);
	}

}
