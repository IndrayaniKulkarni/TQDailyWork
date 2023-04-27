package com.characterStream;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderDemo1Revisit {

	public static void main(String[] args) {
		
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Name =");
			String str = br.readLine();
			
			System.out.println("name = "+str);
			
			br.close();
		}
		catch(Exception e) {
			
		}
	}

}
