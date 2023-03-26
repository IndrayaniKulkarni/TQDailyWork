package com.practiceQs15mar;

public class FindDuplicateWords {

	public static void findDuplicates(String words[]) {
		
		int count=0;
		System.out.println("list of duplicates = ");
		for(int i=0; i<words.length; i++) {
			count = 1;
			if(words[i].equals("visited")) {
				continue;
			}
			for(int j=0; j<i; j++) {
				if(words[i].equals(words[j])) {
					count++;
					words[j]="visited";
				}
			}
			if(count>1) {
				System.out.println(words[i]+":"+count);
			}
		}
	}
	public static void main(String[] args) {
		
		String str = "Big black bug bit a big black dog";
		
		// preprocessing 
		str = str.toLowerCase();
		String words[] = str.split(" ");
		
		findDuplicates(words);
	}

}
