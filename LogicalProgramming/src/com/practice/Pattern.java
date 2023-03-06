/**
 *  3. Pattern
 * edcba
 * edcb
 * edc
 * ed
 * e
 */
package com.practice;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number of rows=");
		int n=sc.nextInt();
		
		char ch = 'a';
//		for(int i=0; i<n; i++) {
//			ch++;
//		}
		for(int i=0; i<n; i++) {
			ch = 'a';
			for(int k=0; k<n-1; k++) {
				ch++;
			}
			for(int j=(n-i); j>0; j--) {
				System.out.print(ch);
				ch--;
			}
			System.out.println();

		}
		sc.close();

	}

}
