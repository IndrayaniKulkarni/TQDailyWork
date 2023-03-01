package com.array2;

import java.util.Arrays;

public class MergeArray {

	public static void merge(int num1[], int num2[]) {
		int size1 = num1.length;
		int size2 = num2.length;
		
		int sizeR = size1+size2;
		
		int result[] = new int[sizeR];
		int i, j, k=0;
		for(i=0, j=0; i<size1 && j<size2; i++, j++) {
			result[k++] = num1[i];
			result[k++] = num2[j];
		}
		while(i<size1) {
			result[k++]=num1[i++];
		}
		while(j<size2) {
			result[k++]=num2[j++];
		}
		System.out.println(Arrays.toString(result));
	}
//	public static void input(int num[]) {
//		for (int i = 0; i < num.length; i++) {
//			num[i] = sc.nextInt();
//		}
	public static void main(String[] args) {
		
		int num1[] = {1,2,3,4};
		int num2[] = {10,20,30};
		
		merge(num1,num2);
	}

}
