package com.practice16Mar;

/*
 * arr = {5,3,1,7,2,4}
 * sum = 22
 * result = 4
 * 
 * 
 */
public class FindTotal {

	public static int sumOfDigits(int sum) {
		int num =sum;
		int totDigits = 0;
		while(num!=0) {
			int r = num%10;
			num = num/10;
			totDigits +=r;
		}
		if(totDigits>9) {
			return sumOfDigits(totDigits);
		}
		return totDigits;
	}
	public static void sumOfArr(int arr[]) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}

		if(sum>9) {
			System.out.println(sumOfDigits(sum));
		}
	}
	public static void main(String[] args) {
		
		int arr[] = new int[] {15,3,1,7,2,4};
		
		sumOfArr(arr);
	}

}
