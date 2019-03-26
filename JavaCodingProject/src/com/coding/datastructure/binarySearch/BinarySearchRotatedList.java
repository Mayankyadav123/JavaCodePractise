package com.coding.datastructure.binarySearch;

public class BinarySearchRotatedList {
	
	public static int bsSearchRotatedList(int[] arr,int key) {
		int index=0;
		int pivot=pivotElement(arr);
		
		if(pivot== -1) {
			index=bs(arr,0,arr.length-1,key);
		}
		if(arr[pivot]==key) {
			return pivot;
		}
		if(key<arr[0]) {
			index=bs(arr,pivot+1,arr.length-1,key);
		}else {
			index=bs(arr,0,pivot-1,key);
		}
		return index;
	}
	
	public static int bs(int[] arr,int l,int h,int key) {
		while(l<=h) {
			int mid=(l+h)/2;
			if(arr[mid]==key) {
				return mid;
			}
			if(key>arr[mid]) {
				l=mid+1;
			}
			if(key<arr[mid]) {
				h=mid-1;
			}
		}
		return -1;
	}

	public static int pivotElement(int[] arr) {
		int l=0;
		int h=arr.length-1;
		int mid=0;
		while(l<=h) {
			mid=(l+h)/2;
			if(mid<h && arr[mid]>arr[mid+1]) {
				return mid;
			}else if(mid>l&& arr[mid]<arr[mid-1]) {
				return mid-1;
			}
			if(arr[mid]>=arr[l]) {
				l=mid+1;
			}else {
				h=mid-1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[]= {7,8,9,1,2,3,4,5,6};
		int key=6;
		int result=bsSearchRotatedList(arr,key);
		System.out.println(result);
	}

}
