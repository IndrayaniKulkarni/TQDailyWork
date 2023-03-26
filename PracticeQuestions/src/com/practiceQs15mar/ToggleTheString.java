package com.practiceQs15mar;

public class ToggleTheString {

	public static void toggle(String str) {
	    char ch[] = str.toCharArray();
	    
	    for(int i=0; i<ch.length; i++) {
	    	if(ch[i]>=97 && ch[i]<=122) {
	    		ch[i] = (char)(ch[i]-32);
	    	}
	    	else {
	    		ch[i] = (char)(ch[i]+32);
	    	}
	    }
	    
	    String result = new String(ch);
	    System.out.println(result);
	}
	public static void main(String[] args) {
		
		String str = "ProGram";
		
		toggle(str);
		
		
	}

}
