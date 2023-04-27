package com.characterStream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderWriterDemo {

	public static void readFile(File f) {
		try {
			FileReader fr = new FileReader(f);
			int i=0;
			while((i=fr.read())!=-1) {
				System.out.print((char)i);
			}
           fr.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void writeFile(File f) {
		try {

			FileWriter fw = new FileWriter(f);
			fw.write("My java codes");
			fw.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		 
		File f = new File("D:\\ThinkQuoient\\JavaEclipse\\MyFiles\\rwdata.txt");
	    writeFile(f);
	    readFile(f);
	
	}

}
