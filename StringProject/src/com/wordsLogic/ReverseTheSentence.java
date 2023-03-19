package com.wordsLogic;

public class ReverseTheSentence {

	public static String reverseWords(String word) {
		char ch[] = word.toCharArray();
		char result[] = new char[ch.length];
		int k=0;
		for(int i=ch.length-1; i>=0; i--) {
			result[k++] = ch[i];
		}
		String r = new String(result);
		return r;
	}
	public static String reverseStr(String str) {
		
		String words[] = str.split("\\s");
		String ans = new String();
		for(int i=0; i<words.length; i++) {
			words[i] = reverseWords(words[i]);
			ans += words[i];
			ans +=" ";
		}
		
		return ans;
	}
	public static void main(String[] args) {
		
		String str = "I am learning Java";
		System.out.println(reverseStr(str));
		
	}

}
