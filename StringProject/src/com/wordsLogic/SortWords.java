package com.wordsLogic;

import java.util.Arrays;
import java.util.Scanner;

public class SortWords {

	public static void sortByLen(String arr[]) {
		String temp;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i].length()>arr[j].length()) {
					temp =arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	public static void sortAlpha(String arr[]) {
		String temp;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i].compareTo(arr[j])>1) {
					// if compare > 1 then str1 greater than str2
					//hence swap
					temp =arr[i];
					arr[i] =arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("String = ");
		String input = sc.nextLine();
		
		String arr[] = input.split("\\s");
		
		sortAlpha(arr);
		System.out.println("Alphabetically sorted words = "+Arrays.toString(arr));
		
		sortByLen(arr);
		System.out.println("Length wise sorted words = "+Arrays.toString(arr));
		sc.close();
		
	}

}
