package com.array1;

import java.util.Scanner;

public class SearchANumber {

	//linear search
	static public int findNumber(int arr[],int target) {
		int index=-1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==target) {
				index = i;
				break;
			}
		}
		return index;
	}
	//binary search
	static public int binarySearch(int arr[],int target) {
		int index=-1;
		int s=0,l=arr.length;
		int mid;
		while(s<=l) {
			mid =(int)((s+l)/2);
			if(arr[s]== target) {
				index = mid;
				break;
			}
			else if(arr[mid]<target) {
				s = mid + 1;
			}
			else if(arr[mid]>target) {
				l = mid - 1;
			}
			
		}
		return index;
	}
	//sentinel search
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Size=");
		int n  =sc.nextInt();
		System.out.println("Key or target to searched = ");
		int target = sc.nextInt();
		
		System.out.println("Array elements = ");
		int nums[] = new int[n];
		
		for(int i=0; i<nums.length; i++) {
			nums[i]=sc.nextInt();
		}
		System.out.println("Number found at "+findNumber(nums,target)+" location.");
		
		System.out.println("binary searc result says -- num found at"+binarySearch(nums,target));
		
		sc.close();
	}

}
