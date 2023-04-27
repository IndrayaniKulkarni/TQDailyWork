package com.dataInputOutputStream;

import java.io.File;

public class FileProperties {

	public static void main(String[] args) {
		
		File f = new File("D:\\ThinkQuoient\\JavaEclipse\\MyFiles\\tq.txt");
//		File f = new File("D:\\ThinkQuoient\\JavaEclipse\\MyFiles"); 
		if(f.exists()) {
			if(f.isFile()) {
				
				System.out.println("File name = "+f.getName());
				System.out.println("Absolute path = "+f.getAbsoluteFile());
				System.out.println("Path = "+f.getPath());
				System.out.println("Length = "+f.length());
				System.out.println("Can write or not = "+f.canWrite());
			}
			else {
				System.out.println("It's directory.");
			}
		}
		else {
			System.out.println("File don't exists.");
		}
	}
}
