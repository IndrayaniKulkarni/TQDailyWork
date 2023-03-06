package com.stringBufferBuilder;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer str = new StringBuffer("Process");
		System.out.println(str.length());
		System.out.println(str.capacity()); 
		
		StringBuffer str1 = new StringBuffer();
		System.out.println(str1.capacity());
	 
		str1.ensureCapacity(20); //curr.capacity * 2 +2
		System.out.println(str.capacity());
	
		str.append(" started..");
		System.out.println(str);
		
		str.replace(13, 16, "ing");
		System.out.println(str);
	
		str.insert(17, "co");
		System.out.println(str);
		
		str.reverse();
		System.out.println(str);
	}

}
