package com.coding.interview.string;

import java.util.Scanner;

public class PrimeNumber {

		public static void main(String args[]) {
			Scanner in=new Scanner(System.in);
			int number=in.nextInt();
			boolean flag=checkPrime(number);
			System.out.println(flag);
		}

		private static boolean checkPrime(int number) {
			// TODO Auto-generated method stub
			if(number<=1) {
				return false;
			}
			//only half because no 2 no's are divisible by more than it's half
			for(int i=2;i<number/2;i++) {
				if(number%i == 0)
				return false;
			}
			return true;
		}
}
