/*
 *  Find even odd number 
 *  
 *  Classname - EvenOdd
 *  
 *  Date - 31 Jan.,2023
 */
package com.ifelse;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("\nPlease enter the integer number = ");
		num = sc.nextInt();
		sc.close();

		if ((num % 2) == 0) {
			System.out.println(num + " is an even number.");
		} else {
			System.out.println(num + " is an odd number.");
		}

	}

}
