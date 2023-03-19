package com.wordsLogic;

public class ReverseString {

	public static void reverseStr(String str) {
		String result = "";
		for (int i = str.length()-1; i >= 0; i--) {
			result += str.charAt(i);
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I am learning Java";
		reverseStr(str);
	}

}
