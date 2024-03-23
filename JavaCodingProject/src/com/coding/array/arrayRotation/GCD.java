package com.coding.array.arrayRotation;

/*
 * Greatest Common Divisor
 * Thus the divisors of 54 are: { 1,2,3,6,9,18,27,54}
 * Similarly, the divisors of 24 are: { 1,2,3,4,6,8,12,24}
 * 
 *  common divisors of 54 and 24: {1,2,3,6}
 *  so 6 is the greatest divisor
 *  
 */
public class GCD {
	public static int gcd(int a,int b) {
		if(a==0) {
			return b;
		}
		System.out.println(a+"-----"+b+"========="+b%a);
		return gcd(b%a,a);
	}
	
	public static void main(String[] args) {
		int a=10, b=15,g;
		g=gcd(a,b);
		System.out.println("GCD(" + a +  " , " + b+ ") = " + g); 
        a = 35; b = 10; 
        g = gcd(a, b); 
        System.out.println("GCD(" + a +  " , " + b+ ") = " + g); 
          
        a = 31; b = 2; 
        g = gcd(a, b); 
        System.out.println("GCD(" + a +  " , " + b+ ") = " + g); 
        
        a = 54; b = 24; 
        g = gcd(a, b); 
        System.out.println("GCD(" + a +  " , " + b+ ") = " + g); 
	}
}
