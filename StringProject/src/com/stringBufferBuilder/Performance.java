package com.stringBufferBuilder;
// Proof string builder faster than string buffer..
public class Performance {

	public static void calculateStringBuffer(StringBuilder sbu) {
		long startTime = System.currentTimeMillis();
		for(int i=0; i<10000; i++) {
			sbu.append("Java");
		}
		System.out.println("Time taken = "+(System.currentTimeMillis()-startTime));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		StringBuffer sb = new StringBuffer();
//		calculateStringBuffer(sb);
//	
		StringBuilder sbu = new StringBuilder();
		calculateStringBuffer(sbu);
	}

}
