/*
 *   1
 *  12
 * 123
 *1234 
 */
package com.number;

import java.util.Scanner;

public class NumberPattern03 {

	public static void main(String[] args) {
			
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=0; i<n; i++)
		{
			//1st
			for(int j=(n-i); j>0; j--)
			{
				System.out.print(" ");
			}
			//2nd
//			for(int j=0; j<(n-i); j++)
//			{
//				System.out.print(" ");
//			}
			for(int k=0; k<n;k++)
			{
				System.out.print(k+1);
			}
			System.out.println();
		}
		sc.close();
		

	}

}
