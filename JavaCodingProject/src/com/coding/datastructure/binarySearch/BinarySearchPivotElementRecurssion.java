package com.coding.datastructure.binarySearch;

public class BinarySearchPivotElementRecurssion {
	
	public static int bsPivotElementRecurssion(int[] arr,int l,int h) {
		int mid=(l+h)/2;
		if(mid<h && arr[mid]>arr[mid+1]) {
			return mid;
		}
		if(mid>l && arr[mid]<arr[mid-1]) {
			return mid-1;
		}
		if(arr[l]>=arr[mid]) {
			h=mid-1;
		}else {
			l=mid+1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {9,10,1,2,3,4,5,6,7};
		int l=0;
		int h=arr.length-1;
		int result=bsPivotElementRecurssion(arr,l,h);
		System.out.println(result);
	}
}