package com.coding.datastructure.binarySearch;

public class BinarySearchPivotElementRecurssion {
	
	public static int bsPivotElementRecurssion(int[] arr,int l,int h) {
		int mid=(l+h)/2;
		if(l>h) {
			return -1;
		}
//		if(l==h) {
//			return l;
//		}
		if(mid<h && arr[mid]>arr[mid+1]) {
			return mid+1;
		}
		if(mid>l && arr[mid]<arr[mid-1]) {
			return mid-1;
		}
		if(arr[l]>=arr[mid]) {
			return bsPivotElementRecurssion(arr,l,mid-1);
			//h=mid-1;
		}
			return bsPivotElementRecurssion(arr,mid+1,h);
			//l=mid+1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {8,9,10,1};
		int l=0;
		int h=arr.length-1;
		int result=bsPivotElementRecurssion(arr,l,h);
		System.out.println(result);
	}
}