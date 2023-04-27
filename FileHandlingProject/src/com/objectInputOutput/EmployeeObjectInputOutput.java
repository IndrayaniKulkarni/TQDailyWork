package com.objectInputOutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeObjectInputOutput {

	public static void addData(File f) {

		try {

			if (!f.exists()) {
				f.createNewFile();
				ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream(f));

				Employee e = new Employee(101, "Jitendra", 50000.0f);
				oout.writeObject(e);
				System.out.println("Data added ..");
				oout.close();
			} else {
				System.out.println("File exists..");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void readData(File f) {
		try {
			// File f = new File("D:\\ThinkQuoient\\JavaEclipse\\MyFiles\\sData.txt");
			if(f.exists())
			{
				ObjectInputStream ooin= new ObjectInputStream(new FileInputStream(f));
				
				Employee emp=(Employee) ooin.readObject();
				System.out.println(emp);
								
				ooin.close();
			}
			
			else
			{
				System.out.println("File doesnot exist........");
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {

		File f = new File("D:\\ThinkQuoient\\JavaEclipse\\MyFiles\\empData.txt");
		//EmployeeObjectInputOutput o = new EmployeeObjectInputOutput();
		
//		addData(f);
		readData(f);
		// transient only stores default vals
		// java.io.WriteAbortedException: writing aborted;
		// java.io.NotSerializableException: com.objectInputOutput.Employee

		// to make it serializable implement that interface

	}

}
