package com.array1;

import java.util.Arrays;
import java.util.Scanner;

public class FreqNumber {

	static Scanner sc = new Scanner(System.in);

	public static void frequency(int num[]) {

		int count;

		for (int i = 0; i < num.length; i++) {
			count = 1;
			if (num[i] == '\0') {
				continue;
			}
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					count++;
					num[j] = '\0';
				}
			}

			System.out.println(num[i] + " : " + count);

		}
	}

	public static void input(int num[]) {
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
	}

	public static void main(String[] args) {

		System.out.println("Size =");
		int n = sc.nextInt();

		int num[] = new int[n];
		input(num);

		System.out.println("Given array = " + Arrays.toString(num));

		System.out.println("Frequency of elements in array = ");
		frequency(num);

	}

}
