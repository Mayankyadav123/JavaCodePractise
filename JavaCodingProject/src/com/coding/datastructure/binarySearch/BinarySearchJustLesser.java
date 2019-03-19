package com.coding.datastructure.binarySearch;

public class BinarySearchJustLesser {

	public static int binarySearchJustLesser(int arr[],int key) {
		int l=0;
		int h=arr.length-1;
		while(l<=h){
			int mid=(l+h)/2;
			if(key<arr[mid]&& key>arr[mid-1]) {
				return mid-1;
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
		int arr[]= {1,10,23,45,67,86};
		int key=60;
		int result=binarySearchJustLesser(arr,key);
		System.out.println(result);
	}

}
