/**
 * 2. Factors of number eg., 9 = 1, 3, 9
 */
package com.practice;

import java.util.Scanner;

public class FactorOfNumber {

	public static void factor(int n) {
		System.out.println("Factors of " + n + " is/are ");
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any integer = ");
		int n= sc.nextInt();
		factor(n);
		sc.close();
	}

}
