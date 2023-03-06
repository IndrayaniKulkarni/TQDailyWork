package com.wordsLogic;

import java.util.Scanner;

public class FindAWord {
	public static boolean find(String words[], String key) {
		
		for(int i=0; i<words.length; i++) {
			if(words[i].equals(key)) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Sentence = ");
		String sentence = sc.nextLine();
		sentence = sentence.toLowerCase();
		String words[] = sentence.split("\\s");
		
		System.out.println("Word to need to search = ");
		String key = sc.next();
		key = key.toLowerCase();
		
		if(find(words,key)) {
			System.out.println("Word found ..");
		}
		else {
			System.out.println("Sorry not found ..");
		}
		sc.close();
	}

}
