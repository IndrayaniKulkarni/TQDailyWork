package com.stringLogical2;

import java.util.Scanner;

public class ReplaceVowels {

	public static String replaceV(String str, char sp) {
		str = str.toLowerCase();
		char ch [] = str.toCharArray();
		
		for(int i=0; i<ch.length; i++) {
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				ch[i] = sp;
			}
		}
		String result = new String(ch);
		return result;
	}
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("String = ");
		String input = sc.next();
		
		System.out.println("to replace with which special char  = ");
		char specialCh = sc.next().charAt(0);
		
		String result = replaceV(input,specialCh);
		System.out.println("Answer = "+result);
		sc.close();
	}

}
