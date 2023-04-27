package com.randomAccess;

import java.io.FileReader;
import java.io.FileWriter;

public class CopyTheFile {

	public static void main(String[] args) {

		try {
			
			FileReader fr = new FileReader("D:\\ThinkQuoient\\JavaEclipse\\MyFiles\\buffData.txt");

			FileWriter fw = new FileWriter("D:\\ThinkQuoient\\JavaEclipse\\MyFiles\\buffData_copy.txt");
			//copy the text from the file buffData to buffData_copy
			int i;
			while((i=fr.read())!=-1) {
				fw.write(i);
				//System.out.println();
			}
	        System.out.println("copied successfully");
			fw.close();
			fr.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
