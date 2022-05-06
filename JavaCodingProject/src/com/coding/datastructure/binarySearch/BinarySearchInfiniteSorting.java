package com.coding.datastructure.binarySearch;

import java.util.Scanner;

public class BinarySearchInfiniteSorting {
	
	public static int bsInfiniteSearchRecursion(int[] arr, int low,int high,int key) {
		// when value is not present even after searching all element
		// we get this condition
		if(low>=high) {
			if(arr[high]==key) {
				return high;
			}else {
			return -1;
			}
		}
		
		while(key>arr[high]) {
			low = high;
			high = 2 * high;
		}
		if(arr[high] == key) {
			return high;
		}
		int mid=0;
		mid=(low+high)/2;
		
		if(arr[mid]==key) {
			return mid; 
		}
		if(arr[mid]<key) {
			low=mid+1;
		}else {
			high=mid-1;
		}		
		return bsInfiniteSearchRecursion(arr,low,high,key);
	}
	
	public static int binarySearchInfiniteSearch(int[] arr,int key) {
		int low=0;
		int mid=0;
		int high=1;
		// key can't be higher than high because its infinite
		while(key>arr[high]) {
			low = high;
			high = 2*high;
		}
		// for infinite series we will consider high as 1 and 
		// then 2*high each time until value is found
		while(low<=high) {
			mid = (low+high)/2;
			if(arr[mid]==key) {
				return mid;
			} else if(arr[mid]>key) {
				high=mid-1;
			} else if(arr[mid]<key){
				low=mid+1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,12,23,24,35,36,47,58,120};
		Scanner in = new Scanner(System.in);
		System.out.println("Enter value to search");
		int key = in.nextInt();
		System.out.println(binarySearchInfiniteSearch(arr,key));
		System.out.println(bsInfiniteSearchRecursion(arr,0,1,key));
	}

}
