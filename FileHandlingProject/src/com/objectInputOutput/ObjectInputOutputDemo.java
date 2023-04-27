package com.objectInputOutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputOutputDemo {

	public void addData() {
		int roll = 12;
		String name = "Kishor";
		
		try {
			File f = new File("D:\\ThinkQuoient\\JavaEclipse\\MyFiles\\sData.txt");
		    if(!f.exists()) {
		    	f.createNewFile();
		    	ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream(f));
		    	
		    	oout.writeInt(roll);
		    	oout.writeObject(name);
		    	System.out.println("Data added ..");
		    	oout.close();
		    }
		    else {
		    	System.out.println("File exists..");
		    }
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void readData() {
		try {
			File f = new File("D:\\ThinkQuoient\\JavaEclipse\\MyFiles\\sData.txt");
			if(f.exists()) {
				ObjectInputStream oout = new ObjectInputStream(new FileInputStream(f));
				
				System.out.println(oout.readInt());
				System.out.println(oout.readObject());
				oout.close();
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		ObjectInputOutputDemo o = new ObjectInputOutputDemo();
		//o.addData();
		o.readData();
		
	}

}
