/*
 * 03 feb
 * extract digit
 */
package com.logical;

import java.util.Scanner;

public class ExtractDigit {

	public static void digit(int num) {
		System.out.println(" Digits = ");
		int r;
		int sum = 0;
		int prod = 1;
		while (num != 0) {
			r = num % 10;
			num = num / 10;
			sum += r;
			prod *= r;
			System.out.print(r + " ");
		}

		System.out.println("\nSum of digits in the number = " + sum);
		System.out.println("\nProduct of digits in the number = " + prod);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("\nNumber=");
		int num = sc.nextInt();
		digit(num);
		sc.close();
	}

}
