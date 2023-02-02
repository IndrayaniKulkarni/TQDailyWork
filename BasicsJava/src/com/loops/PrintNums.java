package com.loops;

import java.util.Scanner;

public class PrintNums {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\nPlease enter any integer = ");
		int n = sc.nextInt();
		
		for(int i=0; i<=n; i++)
		{
			System.out.println(i);
		}
        sc.close();
        
	}

}
