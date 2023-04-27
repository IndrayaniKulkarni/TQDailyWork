package com.dataInputOutputStream;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class DataOutputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      String data = "Think Quotient Python Program";
      try {		
		File f = new File("D:\\ThinkQuoient\\JavaEclipse\\MyFiles\\datatq.txt");
		if(!f.exists()) {
			f.createNewFile();
		    DataOutputStream dout = new DataOutputStream(new FileOutputStream(f));
		   
		    dout.writeInt(65);
		    dout.writeChars("Java program");
		    
		    System.out.println("Data added..");
		    dout.close();
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
