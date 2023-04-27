package com.threadBasics;

public class ThreadApp extends Thread{

	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread());
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		
		ThreadApp t1 = new ThreadApp();
		t1.start();
		
	}

}
