package com.practiceQs15mar;

import java.util.Arrays;

public class ShiftEvenOddSolution {

	public static void separateEO(int ar[]) {
		int left = 0;
		int right = ar.length - 1;

		while (left < right) {
			while (ar[left] % 2 == 0 && left < right)
				left++;
			while (ar[right] % 2 != 0 && left < right)
				right--;

			if (left < right) {
				int tmp = ar[left];
				ar[left] = ar[right];
				ar[right] = tmp;
				left++;
				right--;

			}

		}

	}

	public static void main(String[] args) {

		int arr[] = { 3, 4, 1, 6, 7, 8, 5, 2, 9 };

		System.out.println(Arrays.toString(arr));

		separateEO(arr);

		System.out.println(Arrays.toString(arr));

	}
}
