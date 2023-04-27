package com.basicFileInputOutput;

import java.io.File;
import java.io.FileInputStream;

public class FileInputStreamDemo {

	public static void main(String[] args) {
	
		try {
			File f = new File("D:\\ThinkQuoient\\JavaEclipse\\MyFiles\\tq.txt");
			
			if(f.exists()) {
				FileInputStream fin = new FileInputStream(f);
				
			//	fin.read(); //reads data in byte..gives -1 at end of file
		     	int i = 0;
				while((i=fin.read())!=-1) {
				  System.out.print((char)i);	
				}
				fin.close();
			}
		}
		catch(Exception e) {
			
		}
	}

}
