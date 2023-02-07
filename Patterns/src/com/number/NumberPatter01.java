package com.number;

import java.util.Scanner;

public class NumberPatter01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		// pattern 1
		System.out.println("\nPattern 1");
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		// pattern 2
		System.out.println("\nPattern 2");
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		// pattern 3
		System.out.println("\nPattern 3");
		int n = 1;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.print(n + " ");
				n++;
			}
			System.out.println();
		}

	}

}
