package com.randomAccess;

import java.io.RandomAccessFile;

public class RandomAccessFileDemo2 {

	public static void main(String[] args) {
		
		try {
			RandomAccessFile rf = new RandomAccessFile("D:\\ThinkQuoient\\JavaEclipse\\MyFiles\\names.txt","rw");
			rf.writeUTF("Sahili");
			rf.writeUTF("Rushikesh");
			rf.writeUTF("Pratik");
			
			rf.seek(0);
			System.out.println("------------------------------");
			System.out.println(rf.readUTF());
			System.out.println(rf.readUTF());
			System.out.println(rf.readUTF());
			rf.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
