package com.characterStream;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderDemo2 {

	public static void main(String[] args) {

       try {
    	   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	   
    	   String data = "";
    	   String op = "";
    	   
    	   while(!(data.equalsIgnoreCase("stop"))) {
    		   data = reader.readLine();
    		   if(!data.equals("stop")) {
    			   op = op.concat(data);
    			   op = op.concat("\n");
    		   }
    	   }
    	   
    	   System.out.println(op);
    	   reader.close();
       }
       catch(Exception e) {
    	   System.out.println(e);
       }

	}

}
