package com.coding.basic.interviewcoding;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ArrayTricky {
//Print a1bc23def456....
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s1 = { "a", "b", "c", "d", "e", "f", "g", "h" };
		String[] s2 = { "1", "2", "3", "4", "5", "6", "7", "8" };
		String s3 = "";
		int counts1 = 0;
		int counts2 = 0;
		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j <= i; j++) {
				if (counts1 < s1.length - i) {
					// System.out.print(s1[counts1]);
					s3 = s3 + s1[counts1];
					// System.out.println(s3);
					counts1++;
				} else {
					break;
				}
			}
			for (int j = 0; j <= i; j++) {
				if (counts2 < s2.length - i) {
					// System.out.print(s2[counts2]);
					s3 = s3 + s2[counts2];
					// System.out.println(s3);
					counts2++;
				} else {
					break;
				}
			}
		}
		System.out.println(s3);

	}

}
