package com.alphabet;

public class Pattern1 {

	public static void main(String[] args) {
//		char ch = 'b';
//		for(int i=0; i<=4; i++) {
//			ch='b';
//			for(int j=0; j<i; j++) {
//				System.out.print(ch+" ");
//				ch++;
//			}
//			System.out.println();
//		}
		
//		or 
		
		for(char i='B'; i<='F'; i++ ) {
			for(char j='B'; j<i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
