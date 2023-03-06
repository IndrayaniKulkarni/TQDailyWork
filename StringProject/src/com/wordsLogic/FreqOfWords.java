package com.wordsLogic;

import java.util.Scanner;

public class FreqOfWords {

	public static void frequentWords(String str) {
		str = str.toLowerCase();
		String words[] = str.split("\\s");
		int count=0;
		for(int i=0; i<words.length; i++) {
			count = 1;
			if(words[i].equals("visited")) {
				continue;
			}
			for(int j=i+1; j<words.length; j++) {
				if(words[i].equals(words[j])) {
					count++;
					words[j] = "visited";
				}
			}
			System.out.println(words[i]+" : "+count);
		}
	}
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Sentence = ");
		String str = sc.nextLine();
		
		frequentWords(str);
	}

}
