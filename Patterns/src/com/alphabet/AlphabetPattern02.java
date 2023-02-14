/*
 *  
A B C D 
A B C
A B
A
 */
package com.alphabet;

import java.util.Scanner;

public class AlphabetPattern02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char ch;
		for(int i=0; i<n; i++)
		{
			ch = 'A';
			for(int j=0; j<(n-i); j++)
			{
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
		
		sc.close();

	}

}
