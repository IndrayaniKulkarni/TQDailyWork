package com.loops;

import java.util.Scanner;

public class PrimeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Prime numbers till ");
		n = sc.nextInt();
		sc.close();
		
		if(n==2)
		{
			System.out.print(2+" ");
		}
		for(int i=2; i<=n; i++)
		{
			if(i%2==0 && i!=2)
			{
				continue;
			}
			
			System.out.print(i+ " ");
			
		}
		// 2  3  5  7  11 13 15 

	}

}
