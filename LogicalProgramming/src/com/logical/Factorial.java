/*
 * Factorial 
 */
package com.logical;

import java.util.Scanner;

public class Factorial {

	public static void factorial(int num) {
		long fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;

		}
		System.out.println("Factorial = " + fact);
	}

	// returns int

	public static int add(int a, int b) {
		int sum = (a + b);
		return sum;
	}

	public static String Name() {
		return "hi";
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("\nNumber=");
		int num = sc.nextInt();

		// from 1 to number
//		for(int i=1; i<=num; i++)
//		{
//			fact *=i;
//			
//		}
		// from n to 1
//		for(int i=num; i>1; i--)
//		{
//			fact *=i;
//		}
//		System.out.println("Factorial = "+ fact);

		factorial(num);

		System.out.println(add(10, 20));
		sc.close();

	}

}
