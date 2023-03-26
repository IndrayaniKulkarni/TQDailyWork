package com.logicalArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class CommonElementsOf2Arr {
    static Scanner sc = new Scanner(System.in);
    
    public static void findCommon(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
    	System.out.println("Common elements = ");
    /*	for(int i=0; i<arr1.size(); i++) {
    		for(int j=0; j<arr2.size(); j++) {
        		if((arr1.get(i)).equals(arr2.get(j))) {
        			System.out.println(arr1.get(i));
        		}
        	}
    	}*/
    	//alternatively
    	for(Integer i:arr1) {
    		if(arr2.contains(i)) {
    			System.out.println(i);
    		}
    	}
    }
    
	public static void input(ArrayList<Integer> arr, int n) {
		System.out.println("arr = ");
		for(int i=0; i<n; i++) {
			arr.add(sc.nextInt());
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Size of arr1 = ");
		int n1 = sc.nextInt();
		ArrayList<Integer> arr1 = new ArrayList<>(n1);
		input(arr1,n1);
		
		System.out.println("Size of arr2 = ");
		int n2 = sc.nextInt();
		ArrayList<Integer> arr2 = new ArrayList<>(n2);
		input(arr2,n2);
		
		findCommon(arr1,arr2);
	}

}
