package com.randomAccess;

import java.io.RandomAccessFile;

public class RandomAccessFileDemo1 {

	public static void main(String[] args) {

		try {
			
			RandomAccessFile rf = new RandomAccessFile("D:\\ThinkQuoient\\JavaEclipse\\MyFiles\\random.txt","rw");
			rf.writeChar('C');
			rf.writeInt(100);
			rf.writeFloat(3.14f);
			
			System.out.println("data added ...");
			rf.seek(0);
			System.out.println(rf.readChar());
			System.out.println(rf.readInt());
			System.out.println(rf.readFloat());
			rf.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
