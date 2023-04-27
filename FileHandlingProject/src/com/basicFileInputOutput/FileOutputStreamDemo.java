package com.basicFileInputOutput;

import java.io.File;
import java.io.FileOutputStream;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String data = "Think Quotient Java Program";
      try {		
		File f = new File("D:\\ThinkQuoient\\JavaEclipse\\MyFiles\\tq.txt");
		if(!f.exists()) {
			f.createNewFile();
		    FileOutputStream fout = new FileOutputStream(f);
		   
		    byte[] arr = data.getBytes();
		    fout.write(arr);
		    
		    System.out.println("Data added..");
		    fout.close();
		}
		else {
			System.out.println("File exists");
		}
      }
      catch(Exception e) {
    	  System.out.println(e);
      }
      }
      

}
