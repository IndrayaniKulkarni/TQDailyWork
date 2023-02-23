package com.array1;

import java.util.Scanner;

public class PrimeNum {

	static Scanner sc = new Scanner(System.in);

	public static boolean primeNum(int n) {
		boolean flag = true;
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;

	}

	public static void printPrime(int num[]) {
		System.out.println("\nPrime numbers =");

		for (int i = 0; i < num.length; i++) {
			// System.out.println(num[i]+(primeNum(num[i])?" is prime number.":" is not
			// prime number."));
			if (primeNum(num[i])) {
				System.out.print(num[i] + " ");
			}
		}
	}

	public static void print(int num[]) {
		for (int x : num) {
			System.out.print(x + " ");

		}
	}

	public static void input(int num[]) {
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();

		}
	}

	public static void main(String[] args) {

		System.out.println("Size = ");
		int n = sc.nextInt();
		int num[] = new int[n];
		System.out.println("Array = ");
		input(num);

		printPrime(num);
	}

}
