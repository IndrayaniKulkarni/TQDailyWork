package com.practiceQs15mar;

import java.util.Scanner;

public class PrimeNumber {
static Scanner sc = new Scanner(System.in);
	public static boolean isPrime(int n) {

		if (n == 1 || n == 0) {
			return false;
		}
		for (int i = 2; i < (n / 2); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void primeOrNot(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			
		}
	}
	public static void input(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("size = ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		input(arr);
        primeOrNot(arr);
		//System.out.println(n + " " + (isPrime(n) ? " is a prime number." : " is not a prime numer."));
		sc.close();
	}

}
