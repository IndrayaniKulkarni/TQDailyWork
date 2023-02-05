/*
 *  Armstrong 
 *  n= no. digits
 *  nth power of each digit
 *  add
 *  check same as ori
 */
package com.logical;

public class ArmstrongNumber {

	public static void armstrong(int num) {
		int noDigits = 0;
		int original = num;
		int r;
		// find number of digits
		while (num != 0) {
			r = num % 10;
			num = num / 10;
			noDigits++;
		}
		int armS = 0;
		num = original;
		// extract each digit
		// digit ^ n + sum = sum
		while (num != 0) {
			r = num % 10;
			num = num / 10;
			/*
			 * or int base =1; for(int i=1; i<=noDigits; i++) { base = base * r; }
			 */
			armS = armS + (int) (Math.pow(r, noDigits));
		}
		// check if sum == actual number
		if (armS == original) {
			System.out.println("\nArmstrong");
		} else {
			System.out.println("\nNot armstrong");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		armstrong(153);
		armstrong(43);
	}

}
