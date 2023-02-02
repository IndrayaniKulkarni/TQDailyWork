/*
 *  Table of given integer..
 */
package com.loops;

import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\nPlease enter any integer = ");
		int n = sc.nextInt();
		
		for(int i=1; i<11; i++)
		{
			System.out.println(" " + n + " * " + i + " = " + n*i);
		}
		
		sc.close();
		

	}

}
