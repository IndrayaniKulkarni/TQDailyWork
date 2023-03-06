/**
 * 
 * print all the odd digits from a number 
 */
package com.practice;

import java.util.Scanner;

public class PrintOddsFromNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any number = ");
		int num = sc.nextInt();
		System.out.println("Odd digits from given number are ");
		while(num!=0)
		{
			int r = (num%10);
			num /=10;
			if((r%2)!=0) {
				System.out.print(r+", ");
			}
			
		}
		sc.close();

	}

}
