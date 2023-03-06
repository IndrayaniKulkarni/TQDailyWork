/**
 * Coding16Feb
 * 1.Prime or not 
 * 2. Factors of number eg., 0 = 1, 3, 9
 * 3. Pattern
 * edcba
 * edcb
 * edc
 * ed
 * e
 */
package com.practice;

import java.util.Scanner;

public class PrimeOrNot {

	public static boolean Prime(int n) {
		//no. divisible by 1 and itself
		if(n==0||n==1)
		{
			return false;
		}
		boolean flag = true;
		for(int i=2; i<=n/2; i++) {
			if(n%i==0) {
				flag = false;
				//return false;
				break;
			}
		}
		return flag;
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any integer = ");
		int n = sc.nextInt();
		
		System.out.println(Prime(n)?(n+" is a prime number."):(n+" is not prime number."));
		sc.close();

	}

}
