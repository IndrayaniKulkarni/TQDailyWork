
package com.logical;

import java.util.Scanner;

public class PrimeNum {

	public static void checkPrime(int num) {
		boolean status = true;
		if (num == 0 || num == 1) {
			System.out.println(num + " is not prime number..");
		} else {
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					// System.out.println(num + " is not a prime number.");
					status = false;
					break;
				}

			}
			if (status == true) {
				System.out.println(num + " is a prime number..");
			} else {
				System.out.println(num + "is not a prime number..");
			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("\nNumber=");
		int num = sc.nextInt();
		checkPrime(num);
		sc.close();

	}

}
