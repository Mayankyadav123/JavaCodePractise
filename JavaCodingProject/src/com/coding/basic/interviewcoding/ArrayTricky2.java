package com.coding.basic.interviewcoding;

public class ArrayTricky2 {

	public static void main(String[] args) {
	    String[] s1 = { "a", "b", "c", "d", "e", "f", "g", "h" };
	    String[] s2 = { "1", "2", "3", "4", "5", "6", "7", "8" };

	    StringBuilder output = new StringBuilder();  // use a StringBuilder rather than concatenating strings

	    int sourceIndex1 = 0, sourceIndex2 = 0, stringCount = 1;

	    while (sourceIndex1 < s1.length && sourceIndex2 < s2.length) {  // loop until we run out of source strings
	        for (int i = 0; i < stringCount && sourceIndex1 < s1.length; i++) {  // loop for the number of strings to copy not all the strings (and break if we run out of source strings)
	            output.append(s1[sourceIndex1]);
	            sourceIndex1++;  // move the source index for input 1
	        }
	        for (int i = 0; i < stringCount && sourceIndex2 < s2.length; i++) {  // loop for the number of strings to copy not all the strings (and break if we run out of source strings)
	            output.append(s2[sourceIndex2]);
	            sourceIndex2++;  // move the source index for input 2
	        }
	        stringCount++;  // next time we loop, ask for 1 more source string to be copied from each input array
	    }

	    System.out.println(output.toString());
	}

}
