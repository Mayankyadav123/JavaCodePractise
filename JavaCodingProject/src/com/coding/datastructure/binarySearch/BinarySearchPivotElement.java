package com.coding.datastructure.binarySearch;

//rotation list 7 8 1 2 3 4 5 6 here 8 is pivot 
public class BinarySearchPivotElement {
	public static int binarySearchPivotElement(int arr[]) {
		int l=0;
		int h=arr.length-1;
		int mid=0;
		while(l<=h) {
			mid=(l+h)/2;
			if(mid<h&&arr[mid]>arr[mid+1]) {
				return mid;
			}else if(mid>l && arr[mid]<arr[mid-1]) {
				return mid-1;
			}
			if(arr[l]<=arr[mid]) {
				l=mid+1;
			}else {
				h=mid-1;
			}
		}
		return -1;  
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,4,5,16,34,1};
		int result=binarySearchPivotElement(arr);
		System.out.println(result);
	}
}
