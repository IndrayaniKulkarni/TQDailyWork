package com.logicalArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicates {

	public static void removeD(ArrayList<Integer> arr) {
		
		ArrayList<Integer> arr3 = new ArrayList<>();
		for(Integer i:arr) {
			if(!arr3.contains(i))
			{
				arr3.add(i);
			}
		}
		System.out.println(arr3);
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Size of arr1 = ");
		int n1 = sc.nextInt();
		ArrayList<Integer> arr1 = new ArrayList<>(n1);
		CommonElementsOf2Arr.input(arr1, n1);
		
		removeD(arr1);
		
	}

}
