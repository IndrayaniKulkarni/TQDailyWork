package com.characterStream;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class BufferedReaderInFile {

	public static void main(String[] args) {

       try {
    	   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	   
    	   FileWriter fw = new FileWriter("D:\\ThinkQuoient\\JavaEclipse\\MyFiles\\buffData.txt");
   		
    	  
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
       }
       catch(Exception e) {
    	   System.out.println(e);
       }

	}

}
