package com.coding.datastructure.LinkedList;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountFrequencyTest {

	public static void frequency(String s) {
		HashMap<Character, Integer> frequencyMap=new HashMap<Character, Integer>();
        char[] strArray = s.toCharArray();
      
        for(char ch='a';ch<='z';ch++) {
        	frequencyMap.put(ch, 0); 
        }
        for (char c : strArray) { 
            if (frequencyMap.containsKey(c)) { 
            	frequencyMap.put(c, frequencyMap.get(c) + 1); 
            } 
            else { 
            	frequencyMap.put(c, 1); 
            } 
        } 
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) { 
            System.out.println(entry.getKey() + ":" + entry.getValue()); 
        } 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		String s=in.next();
		String input=s.replaceAll("[^a-zA-Z]","");
		frequency(input.toLowerCase());
	}

}
