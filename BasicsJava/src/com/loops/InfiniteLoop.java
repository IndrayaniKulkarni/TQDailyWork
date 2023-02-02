package com.loops;

import java.util.Scanner;

public class InfiniteLoop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		// logical error1
//		for (int i = 0; i >= n; i++) {
//			System.out.println(i);
//		}

		// logical error 2
//		for (int i = 0; i <= n; i--) {
//			System.out.println(i);
//		}
		
		// Correct logic
		
		for (int i = 0; i <= n; i++) {
			System.out.println(i);
		}
		sc.close();

	}

}
