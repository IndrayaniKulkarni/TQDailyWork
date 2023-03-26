package com.practiceQs15mar;

import java.util.Arrays;
import java.util.Scanner;

/*
 *  i/p- 1 7 5 1 3 6
 *  o/p- 2 6 7 5 1 3
 */
public class ShiftOddAfterEven {

	public static void shiftEvenOdd(int arr[]) {

		// with different array
		int result[] = new int[arr.length];
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				result[k++] = arr[i];
//				System.out.println(arr[i]);
			}
		}
//		System.out.println(Arrays.toString(result));
//		System.out.println(k);
		k--;
		for (int i = k; i < arr.length; i++) {
			if (arr[i] != 0) {
				result[k++] = arr[i];
			}
		}
		System.out.println("Before shifing = " + Arrays.toString(arr));
		System.out.println("After shifting =" + Arrays.toString(result));
	}

	public static void inplaceShift(int arr[]) {
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				if(i<arr.length/2) {
					continue;
				}
				else {
					for(int j=0; j<arr.length/2; j++) {
						if(arr[j]%2!=0) {
							int temp = arr[i];
							arr[i] =arr[j];
							arr[j] = temp;
						}
					}
				}
			}
			
		}
		System.out.println("after shift = " + Arrays.toString(arr));
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("size = ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
//		System.out.println(Arrays.toString(arr));
		System.out.println("With different array for storing =");
		shiftEvenOdd(arr);

		System.out.println("In place shift");
		System.out.println("before shift = " + Arrays.toString(arr));
		inplaceShift(arr);
		sc.close();
	}

}
