package com.bufferedInputOutput;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class BufferedInputStreamDemo {

	public static void main(String[] args) {
	
		try {
			File f = new File("D:\\ThinkQuoient\\JavaEclipse\\MyFiles\\tq1.txt");
			
			if(f.exists()) {
				BufferedInputStream bin =  new BufferedInputStream(new FileInputStream(f));
				
		     	int i = 0;
				while((i=bin.read())!=-1) {
				  System.out.print((char)i);	
				}
				bin.close();
			}
		}
		catch(Exception e) {
			
		}
	}

}
