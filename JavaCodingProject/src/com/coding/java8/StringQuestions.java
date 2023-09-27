package com.coding.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringQuestions {
	
	
	public static int findFirstRepeatingElement(int[] arr) {
		HashSet<Integer> set=new HashSet<Integer>();
		
		for (int i=0;i<=arr.length-1;i++) {
			if(!set.contains(arr[i])) {
				set.add(arr[i]);
			}else {
				return arr[i];
			}
		}
		return  -1;
	}
	
	public static int findpivot(int[] arr ) {
		int low=0;
		int high= arr.length-1;
		while(low<high) {
			int mid=(low+high)/2;
			if(mid<high && arr[mid]>arr[mid+1]) {
				return mid;
			} else if(mid>low && arr[mid]<arr[mid-1]) {
				return mid;
			}
		}
		return  -1;
	}
	
	public static int findClosestNumber(int[] arr,int low,int high,int key) {
//		if(arr[low]>=key) {
//			return low;
//		}
//		if(low>high) {
//			return  high;
//		}
//		
//		if(key - arr[low]<arr[high]-key) {
//			return low;
//		}
//		if(key-arr[low] >arr[high]-key) {
//			return high;
//		}
//		
//		int mid = (low+high)/2;
//		if(arr[mid]<key) {
//			low=mid+1;
//		} else if(arr[mid]>key) {
//			high=mid-1;
//		}
		//TODO
		return  findClosestNumber(arr,low,high,key);
	}
	
	public static int findpositionInfinitearr(int[] arr,int key) {
		// we are finding value for  High an then doing binary search
		int low= 0;
		int high=low+1;
		while(arr[high]<key) {
			low=high;
			if(2*high < arr.length-1)
				high = 2*high;            
	            else
	            	high = arr.length-1;
	             			
		}
		System.out.println("called binary search");
		return binarySearch(arr,low,high,key) ;
	}
	
	
	public static int binarySearch(int[] arr,int low,int high,int key) {
		
		if(low>=high) {
			if(arr[high]==key) {
				return high;
			} else {
				return  -1;
			}
		}
		
		int mid=(low+high)/2;
		
		if(arr[mid]==key) {
			return mid;
		}
		
		if(arr[mid]<key) {
			low = mid +1;
		} else if(arr[mid]>key) {
			high= mid-1;
		}
		
		return binarySearch(arr,low,high,key);
	}
	
	
    /**
     * permutation function
     * @param str string to calculate permutation for
     * @param l starting index
     * @param r end index
     */
    private static void permute(String str, int l, int r)
    {
        if (l == r)
            System.out.println(str);
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }
 
    /**
     * Swap Characters at position
     * @param a string value
     * @param i position 1
     * @param j position 2
     * @return swapped string
     */
    public static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
    	System.out.println(a+":"+i+":"+j+":"+String.valueOf(charArray));
        return String.valueOf(charArray);
    }
	
	public static void main(String args[]) {
		
		String str = "Geek for Geeks";
		
		//1. Find duplicate occurance
		
		Map<String,Long> result=Arrays.stream(str.split("")).map(String::toLowerCase).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		result.entrySet().forEach(obj->System.out.println(obj.getKey()+":"+obj.getValue()));
		
		
		Map<String,Long> result1=Arrays.stream(str.split("")).map(String::toLowerCase).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		
		
		// Find element position/index in a sorted array
		int arr[]= {1,12,23,24,35,36,47,58,120};
		int position = binarySearch(arr,0,arr.length-1,23);
		System.out.println(position);
		
		// Find element in infinite array  we need to find high pointer start with high=low+1
		int positioninInfarr = findpositionInfinitearr(arr, 58);
		System.out.println("infinite array position"+positioninInfarr);
		
		// rotate a list
				
		// find middle element
		
		// find nearest element
	//	int position1 = findClosestNumber(arr, 0, arr.length-1, 47);
		
		
		//find nearest high number
		
		// find pivot element
		int arrpiv[] = {1,7,3,6,5,6};
		int pivot = findpivot(arrpiv);
		System.out.println(arrpiv[pivot]);

		// find repeated element
		int arrrepeat[] = {1,7,3,6,5,6};
		int firstelement=findFirstRepeatingElement(arrrepeat);
		
		System.out.println(firstelement);
		
		// find element in rotated array with duplicate
		int[] arrRotatedup = {7,8,9,1,2,3,4,4,5,6};
		
		// Backtracking question
		//find max combination ex ABC ACB BAC BCA CAB CBA
		String val = "ABC";
		permute(val, 0, val.length()- 1);
		
		
	}

}
