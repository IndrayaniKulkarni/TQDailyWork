/*
 *  Find greatest of 3 nums 
 *  
 *  Classname - LargestOfThreeNum
 *  
 *  Date - 31 Jan., 2023
 *  
 */
package com.ifelse;

import java.util.Scanner;

public class LargestOfThreeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("\nPlease enter 3 integer numbers = ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		sc.close();
		
		if(num1>num2)
		{
			if(num1>num3)
			{
				System.out.println(num1 + " is largest number.");
			}
			else 
			{
				System.out.println(num3 + " is largest number.");
			}
		}
		else if(num2>num1)
		{
			if(num2>num3)
			{
				System.out.println(num1 + " is largest number.");
			}
			else 
			{
				System.out.println(num3 + " is largest number.");
			}
		}

	}

}
