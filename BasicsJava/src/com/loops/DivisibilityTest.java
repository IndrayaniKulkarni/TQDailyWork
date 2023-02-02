package com.loops;

import java.util.Scanner;

public class DivisibilityTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\nPlease enter any integer = ");
		int n = sc.nextInt();
		
		sc.close();
		System.out.println("\n Values divisble by 5 are ");
		for(int i=0; i<=n; i++)
		{
			if(i%5==0)
			{
				System.out.println(i);
			}
			else
			{
				continue;
			}
		}
		
		System.out.println("\n Values not divisble by 5 are ");
		for(int i=0; i<=n; i++)
		{
			if(i%5==0)
			{
				continue;
			}
			System.out.println(i);
		}

	}

}
