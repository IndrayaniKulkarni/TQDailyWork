package com.bufferedInputOutput;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class BufferedOutputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String data = "Think Quotient Python Program";
      try {		
		File f = new File("D:\\ThinkQuoient\\JavaEclipse\\MyFiles\\tq1.txt");
		if(!f.exists()) {
			f.createNewFile();
		    FileOutputStream fout = new FileOutputStream(f);
		   
		    BufferedOutputStream bout = new BufferedOutputStream(fout);
		    
		    byte[] arr = data.getBytes();
		    bout.write(arr);
		    
		    System.out.println("Data added..");
		    bout.close();
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
