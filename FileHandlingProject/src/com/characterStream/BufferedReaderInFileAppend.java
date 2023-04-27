package com.characterStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class BufferedReaderInFileAppend {

	public static void main(String[] args) {

       try {
    	   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	   
    	   FileWriter fw = new FileWriter("D:\\ThinkQuoient\\JavaEclipse\\MyFiles\\buffData.txt",true);
    	   String data = "";
    	   while(!(data.equalsIgnoreCase("stop"))) {
    		   data = reader.readLine();
    		   if(!data.equals("stop")) {
    			  fw.write(data);
    			   fw.write("\n");
    		   }
    	   }
    	   reader.close();
           fw.close();
           
           //read from file
           BufferedReader br = new BufferedReader(new FileReader("D:\\ThinkQuoient\\JavaEclipse\\MyFiles\\buffData.txt"));
            System.out.println("----------------------------------");
            int ch;
            while((ch=br.read())!=-1) {
            	System.out.print((char)ch);
            }
       
           br.close();
       }
       catch(Exception e) {
    	   System.out.println(e);
       }

	}

}
