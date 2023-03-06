package com.stringLogical2;

import java.util.Scanner;

public class FrequencyOfCharacters {

	public static void countFrequency(String s) {
		s = s.toLowerCase();
		char ch []= s.toCharArray();
		int count=0;
		for(int i=0; i<ch.length; i++) {
			count = 1;
			if(ch[i]=='\0') {
				continue;
			}
			for(int j=i+1; j<ch.length; j++) {
				if(ch[i]==ch[j]) {
					ch[j]='\0';//maek counted char as null
					count++;
				}
				
			}
			System.out.println(ch[i]+" : "+count);
		}
	}
	public static void main(String[] args) {
		
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("String = ");
		String st = sc.next();
		
		countFrequency(st);
		
	}

}
