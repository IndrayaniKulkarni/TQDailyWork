package com.loops;

import java.util.Scanner;

public class ContinueExample {

	public static void main(String[] args) {

		int n;

		Scanner sc = new Scanner(System.in);
		System.out.println("\nInput = ");
		n = sc.nextInt();
		sc.close();

		for (int i = 1; i <= n; i++) {
			if ((i % 5 == 0) || (i % 7 == 0)) {
				continue;
			}
			// prints number which are not divisble by 5 or 7
			System.out.println(i);
		}

	}

}
