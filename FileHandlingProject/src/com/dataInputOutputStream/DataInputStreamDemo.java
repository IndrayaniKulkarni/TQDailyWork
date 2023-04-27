package com.dataInputOutputStream;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

public class DataInputStreamDemo {

	public static void main(String[] args) {
	
		try {
			File f = new File("D:\\ThinkQuoient\\JavaEclipse\\MyFiles\\tq1.txt");
			
			if(f.exists()) {
				DataInputStream din =  new DataInputStream(new FileInputStream(f));
				
				// no .of bytes
				int count = din.available();
				byte[] arr = new byte[count];
				 din.read(arr);
				for(byte b:arr) {
					System.out.print((char)b);
				}
		     	din.close();
			}
		}
		catch(Exception e) {
			
		}
	}

}
