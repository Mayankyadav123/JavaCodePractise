package com.coding.datastructure.LinkedList;

public class BinarySearch {
	
	
	public static int bs(int[] arr,int key,int l,int h) {
		if(l>h) {
			return -1;
		}
		int mid=(l+h)/2;
		if(arr[mid]==key) {
			return mid;
		}
		if(arr[mid]<key) {
			return bs(arr,key,mid+1,h);
		}if(key<arr[mid]) {
			return bs(arr,key,l,mid-1);
		}
		return bs(arr,key,l,h);
	}

	public static int bs(int[] arr,int key) {
		int l=0;
		int h=arr.length-1;
		while(l<h) {
			int mid=(l+h)/2;
			if(arr[mid]==key) {
				return mid;
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
		int arr[]= {1,2,3,4,5,6,7,8};
		int key=10;
		int result=bs(arr,key,0,arr.length-1);
		System.out.println(result);
	}

}
