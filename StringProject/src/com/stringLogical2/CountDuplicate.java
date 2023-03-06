package com.stringLogical2;

import java.util.Scanner;

public class CountDuplicate {

	public static void duplicate(String s) {
		System.out.println("Duplicate elements are ");
		s = s.toLowerCase();
		char ch[] = s.toCharArray();
		int count=0;
		for(int i=0; i<ch.length; i++) {
			count = 1;
			if(ch[i]=='\0') {
				continue;
			}
			for(int j=i+1; j<ch.length; j++) {
				if(ch[i]==ch[j]) {
					count++;
					ch[j]='\0';
				}
			}
			if(count>1) {
				System.out.print(ch[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("String =");
		String s = sc.next();
		
		duplicate(s);
	}

}
