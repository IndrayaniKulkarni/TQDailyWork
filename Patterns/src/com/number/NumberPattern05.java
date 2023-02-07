/*
 * 4
    1 
   1 2 
  1 2 3 
 1 2 3 4 
 */
package com.number;

import java.util.Scanner;

public class NumberPattern05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=0; i<n; i++)
		{
			for(int j=(n-i-1); j>0; j--)
			{
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++)
			{
				System.out.print((j+1)+" ");
			}
			System.out.println();
		}
		sc.close();

	}

}
