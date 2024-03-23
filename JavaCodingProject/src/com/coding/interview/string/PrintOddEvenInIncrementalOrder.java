package com.coding.interview.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PrintOddEvenInIncrementalOrder {

	
	public static int[] arrange(int input1,int[] arr) {
		//input1=7;
		
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		Collections.sort(list);
		List<Integer> evenlist=list.stream().filter(e->e%2==0).collect(Collectors.toList());
		List<Integer> oddlist=list.stream().filter(e->e%2!=0).collect(Collectors.toList());
		boolean oddflag=false;
		
		if(list.get(0)%2!=0) {  // first check first value is odd or even
			oddflag=true;
		}
		
		int[] result= new int[input1];
		for(int i=0;i<input1;i++) { // then check all 4 condition
			if(oddflag && !oddlist.isEmpty()) {
				result[i] = oddlist.get(0);
				oddlist.remove(0);
				oddflag=false;
				System.out.print(result[i]+" ");
			} else if(!oddflag && !evenlist.isEmpty()) {
				result[i] = evenlist.get(0);
				evenlist.remove(0);
				oddflag=true;
				System.out.print(result[i]+" ");
			} else if(!oddflag &&evenlist.isEmpty()) {
				if(!oddlist.isEmpty()) {
					result[i] = oddlist.get(0);
					oddlist.remove(0);
					System.out.print(result[i]+" ");
				}
			} else if(oddflag &&oddlist.isEmpty()) {
				if(!evenlist.isEmpty()) {
					result[i] = oddlist.get(0);
					oddlist.remove(0);
					System.out.print(result[i]+" ");
				}
			}
			
			//try with basic for loop of i and j also
			
		}
		
		return result;
	}

	
	public static void main(String args[]) {
		// {5,3,4,2,19,1,17}
//		try (Scanner sc = new Scanner(System.in)) {
//			System.out.println("Enter size");
//			int size=sc.nextInt();
//			int[] arr= new int[size];
//			System.out.println("Enter all the elements");
//			for(int i=0;i<size;i++) {
//				arr[i]=sc.nextInt();
//			}
//			sc.close();
//			int[] result= arrange(size,arr);
//			//System.out.println(result);
//		}		
		 int[] dummyarr = new int[]{ 5,19,34,23,11,2,31 }; 
		 
 		  int[] result= arrange(dummyarr.length,dummyarr);
		 System.out.println(Arrays.toString(result));
	}
	
	
}
