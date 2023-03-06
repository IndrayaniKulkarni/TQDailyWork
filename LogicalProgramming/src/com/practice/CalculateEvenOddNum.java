/**
 * calculate odd and even digits from a number 
 */
package com.practice;

import java.util.Scanner;

public class CalculateEvenOddNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int orig = n;
		//first even then odd
		System.out.println("Even digits = ");
		while(n!=0) {
			
			int r = n%10;
			if(r%2==0) {
				System.out.print(r+", ");
			}
			n /=10;
		}
		
		//odd
		System.out.println("\nOdd digits = ");
		while(orig!=0) {
			int r = orig%10;
			if(r%2!=0) {
				System.out.print(r+", ");
			}
			orig /=10;
		}
		
		sc.close();

	}

}
