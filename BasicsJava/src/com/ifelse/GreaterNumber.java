/*
 * First created package and in it created a class with main method.
 * 
 * Classname - GreaterNumber
 * 
 * Date - 31 Jan.,2023
 * 
 */
package com.ifelse;

import java.util.Scanner;

public class GreaterNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		Scanner sc = new Scanner(System.in);

		System.out.println("\n Please enter the first number = ");
		num1 = sc.nextInt();
		System.out.println("\n Second number = ");
		num2 = sc.nextInt();
		sc.close();

		if (num1 > num2) {
			System.out.println("\n " + num1 + " is the greater number .");
		} else {
			System.out.println("\n " + num2 + " is the greater number .");
		}

	}

}
