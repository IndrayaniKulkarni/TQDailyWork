package com.threadBasics;

public class ThreadClassDemo extends Thread{

	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread());
		     System.out.println("Priority = "+Thread.currentThread().getPriority());
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		
		ThreadClassDemo t1 = new ThreadClassDemo();
		//default priority = 5
		t1.setName("MyThread");
		t1.setPriority(7);
		t1.start();
		
	}

}
