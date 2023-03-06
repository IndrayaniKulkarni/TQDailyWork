package com.stringLogical2;

import java.util.Scanner;

public class Anagram {

	public static void sortArray(char ch[]) {
		
		for(int i=0; i<ch.length; i++) {
			for(int j=i+1; j<ch.length; j++) {
				if(ch[i]>ch[j]) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
	}
	public static boolean checkEquals(char ch1[], char ch2[]) {
		boolean flag = true;
		for(int i=0; i<ch1.length; i++) {
			if(ch1[i]!=ch2[i]) {
				flag = false;
				break;
			}
		}
		
		return flag;
	}
	public static void checkIfAnagram(String s1, String s2) {
		boolean status = false;
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		if(s1.length() == s2.length()) {
			char ch1[] = s1.toCharArray();
			char ch2[] = s2.toCharArray();
			
			sortArray(ch1);
			sortArray(ch2);
//			System.out.println(Arrays.toString(ch1)+" "+ Arrays.toString(ch2));
//			System.out.println(checkEquals(ch1, ch2));
			if(checkEquals(ch1, ch2)) {
				status = true;
//				System.out.println("Strings are anagram of each other.");
			}
		}
		if(!status) {
			System.out.println("Strings are not anagram of each other..");
		}
		else {
			System.out.println("Strings are anagram of each other.");
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("String 1 = ");
		String s1 = sc.next();
		
		System.out.println("String 2 = ");
		String s2 = sc.next();
		
		checkIfAnagram(s1,s2);
		sc.close();
	}

}
