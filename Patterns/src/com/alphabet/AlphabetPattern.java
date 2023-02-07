/*
 * A
 * A B 
 * A B C 
 * A B C D
 * A B C D E
 * 
 */
package com.alphabet;

import java.util.Scanner;

public class AlphabetPattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<=n; i++)
		{
			char ch = 'A';
			for(int j=0; j<i; j++)
			{
				System.out.print(ch+ " ");
				ch++;
			}
			System.out.println();
		}
		sc.close();
	}

}
