package com.stringLogical2;

public class UniqueFromS2 {

	public static void uniqueStrings(String s1[], String s2[]) {
//		boolean flag = false;
		int j;
		for(int i=0; i<s1.length; i++) {
			for(j=0; j<s2.length; j++) {
				if(s1[i].equalsIgnoreCase(s2[j])) {
					s2[j] = "\0";
				}				
			}
			
		}
		for(String x:s2) {
			if(x!="\0") {
				System.out.print(x+" ");
			}
		}
			
	}
	public static void uniqueStrings2(String s1[], String s2[]) {
		boolean flag = false;
		for(String x:s2) {
			flag = false;
			for(String y:s1) {
				if(x.equals(y)) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				System.out.print(x+" ");
			}
		}
	}

	public static void main(String[] args) {

		String s1[] = { "Shruti", "Ajay", "Suraj", "Mamta", "Vinod" };
		String s2[] = { "Gaurav", "Sharukh", "Ajay", "Saili", "Vinod" };

		uniqueStrings(s1, s2);
		uniqueStrings2(s1, s2);
	}

}
