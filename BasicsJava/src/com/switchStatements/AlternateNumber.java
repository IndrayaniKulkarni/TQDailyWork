/*
 *  Print alternate number from 1 to n 
 *  
 */
package com.switchStatements;

import java.util.Scanner;

public class AlternateNumber {

	public static void main(String[] args) {
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n enter number till which alternate numbers should be displayed");
		n= sc.nextInt();		
		sc.close();
		
		for(int i=0; i<=n; i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
			else
			{
				continue;
			}
		}		

	}
}
