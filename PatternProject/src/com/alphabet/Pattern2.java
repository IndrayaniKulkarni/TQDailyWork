package com.alphabet;

public class Pattern2 {

	public static void main(String[] args) {
		
		for(char i='G'; i>='B'; i--) {
			for(char j='G'; j>=i; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
