package com.coding.array.arrayRotation;
import java.util.Scanner;
// Best for reversal
public class ArrayReverseRotationAlgo {
	
	private static void reverse(int arr[], int start, int end) {
		int temp;
		while(start<end) {
			temp = arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;// single array hai to start ka pointer aage badega
			end--;//end ka ya last ka piche aayega
		}
	}
	
	private static void leftRotate(int arr[],int d) {
		int n=arr.length;
		reverse(arr,0,d-1);
		reverse(arr,d,n-1);
		reverse(arr,0,n-1);

	}
	
	 /* function to print an array */
    private static void printArray(int arr[]) 
    { 
        System.out.println("RESULT"); 
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " "); 
        }
    } 
    
    
	public static void main(String args[]) {
		int n;
		// no. of rotate
		int d;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter length of array:");
		n= s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter no. of rotation :");
		d= s.nextInt();
		System.out.println("Enter all the elements");
		for(int i=0;i<=n-1;i++) {
			a[i]= s.nextInt();
		}
		leftRotate(a,d);
		printArray(a);
		
	}

}
