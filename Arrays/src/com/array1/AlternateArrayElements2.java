/**
 * example
 * array 1 = { 6, 7, 1, 2, 3, 4} (length = 6)
 * array 2 = { 8, 9, 12, 13} (length = 4)
 * result = { 6, 9, 1, 13, 3, 4}
 * 
 * if
 * arr1 = 1,2,3,4
 * arr2 = 5,6,7,8
 * result = 1, 6, 3, 8
 * 
 * max length of array should be size of the result array
 */
package com.array1;

import java.util.Arrays;
import java.util.Scanner;

public class AlternateArrayElements2 {
	static Scanner sc = new Scanner(System.in);

	public static int[] mergeAlternate(int num1[], int num2[]) {
		int sizeR  = (num1.length>num2.length)?(num1.length):(num2.length);
		int result[] = new int[sizeR];
		
		int loopLen = (num1.length<num2.length)?(num1.length):(num2.length);
		
		int i=0, j=0,k=0;
		
		for(k=0; k<loopLen; k++) {
			if(k%2==0) {
				result[k] = num1[i];
			}
			else {
				result[k] = num2[j];
			}
			i++;
			j++;
		}

		while(i<num1.length) {
			result[k++]=num1[i++];
		}
		while(j<num2.length) {
			result[k++]=num2[j++];
		}
		
		return result;
	}
 	public static int[] alternateElement(int num1[], int num2[]) {
		
		int sizeR  = (num1.length>num2.length)?(num1.length):(num2.length);
		//int k=0;
		int i = 0, j=1;
		int count =0;
		int result[] = new int[sizeR];
		for(int k=0; k<result.length; k++) {
			if(count%2==0) {
				result[k]=num1[i];
				i+=2;
				count++;
			}
			else {
				result[k]=num2[j];
				j+=2;
				count++;
			}
		}
		/*  for(int i=0; i<num1.length; i++) {
			for(int j=0; j<num2.length; j++) {
				if(i%2==0) {
					result[k]=num1[i];
				}
				else {
					result[k]=num2[j];
				}
				System.out.print(result[k]+" ");
				k++;
			}
			
		}*/
		return result;
				
	}
	public static void main(String[] args) {

		System.out.println("Size of array 1 =");
		int n1 = sc.nextInt();
		System.out.println("Size of array 2 =");
		int n2 = sc.nextInt();
		
		int num1[] = new int[n1];
		int num2[] = new int[n2];
		
		System.out.println("Array 1 = ");
		FreqNumber.input(num1);
		System.out.println("Array 2 = ");
		FreqNumber.input(num2);
		
		System.out.println("Both arrays  = ");
		System.out.println("Array1="+Arrays.toString(num1));
		System.out.println("Array2="+Arrays.toString(num2));
		
		System.out.println("Resultant array = ");
		int sizeR  = (num1.length>num2.length)?(num1.length):(num2.length);
		int result[] = new int[sizeR];
		result = mergeAlternate(num1,num2);
		
		System.out.println(Arrays.toString(result));
		
	}

}
