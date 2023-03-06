package com.stringLogical2;

import java.util.Scanner;

public class NextCharacter {

	public static String replaceByNextChar(String str) {
		str = str.toLowerCase();
		char ch [] = str.toCharArray();
		int i;
		for(i=0; i<ch.length-1; i++) {
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				ch[i] = ch[i+1];
			}
		}
		//replace last vowel with first character
		if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
			ch[i] = ch[0];
		}
		String result = new String(ch);
		return result;
	}
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("String = ");
		String input = sc.next();
//		System.out.println("to replace with which special char  = ");
//		char specialCh = sc.next().charAt(0);
		String result = replaceByNextChar(input);
		System.out.println("Answer = "+result);
		sc.close();
	}


}
