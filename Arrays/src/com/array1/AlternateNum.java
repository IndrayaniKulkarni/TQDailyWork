package com.array1;

import java.util.Scanner;

public class AlternateNum {
	static Scanner sc = new Scanner(System.in);

	public static void alternate(int a[]) {
		for (int i = 0; i < a.length; i += 2) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		//with another method
//		System.out.println("with even odd logic ");
		for (int i = 0; i < a.length; i ++) {
			if(i%2==0) {
				System.out.print(a[i] + " ");
			}
		}
	}
	public static void print(int a[]) {
		for (int x : a) {
			System.out.print(x + " ");
		}
	}

	public static void input(int a[]) {
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
	}

	public static void main(String[] args) {

		int n = sc.nextInt();
		int a[] = new int[n];
		input(a);
		System.out.println("Before replace");
		print(a);

		System.out.println("\nAlternate values in the array = ");
		alternate(a);

	}

}
