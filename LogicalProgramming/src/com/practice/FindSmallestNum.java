/**
 * Smallest of 3 numbers using ternary op

print all the odd digits from a number 

calculate odd and even digits from a number 

find 
 */
package com.practice;

import java.util.Scanner;

public class FindSmallestNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\nNumber 1= ");
		int num1 = sc.nextInt();
		System.out.println("\nNumber 2= ");
		int num2 = sc.nextInt();
		System.out.println("\nNumber 3= ");
		int num3 = sc.nextInt();
		
		System.out.println("Small number out of "+num1+", "+num2+", "+num3);
		System.out.println((num1<num2)?((num1<num3)?num1:num2):((num2<num3)?num2:num3));
		sc.close();

	}

}
