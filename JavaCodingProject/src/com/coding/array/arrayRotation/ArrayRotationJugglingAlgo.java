package com.coding.array.arrayRotation;

import java.util.Arrays;

public class ArrayRotationJugglingAlgo {

	/**
	 * GCD is calculated by dividing total size by no. n and rotation required d
	 * GCD decides the no. of sets and no. of times inside for loop work
	 * @param arr
	 * @param d left rotate by d element
	 * @param n size of array
	 */
	public void leftRotate(int arr[], int d, int n) {
		d=d%n; // taki total size se zyada rotation hoto d exceed na kare
		int i,j,k,temp;
		int g_c_d=gcd(d,n);
		for(i=0; i<g_c_d;i++) {
			temp = arr[i];
			j=i; 
			while (true) {
				k =j+d; // position + difference in index
				if(k>=n) {
					k=k-n;
				}
				if(k==i) {
					break;
				}
				arr[j] = arr[k];
				j=k;
			}
			arr[j] = temp;
		}
		
	}
	
	public void printArray(int arr[],int size) {
		int i;
		for(i=0;i<size;i++)
			System.out.print(arr[i]+" ");
	}
	
	public int gcd(int a,int b) {
		if(b==0) {
			return a;
		}else {
			return gcd(b,a%b);
		}
	}
	
	public static void main(String[] args) {
		ArrayRotationJugglingAlgo rotate = new ArrayRotationJugglingAlgo();
		int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12};
		rotate.leftRotate(arr, 4, arr.length);
		rotate.printArray(arr, arr.length);
	}
}
