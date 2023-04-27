package com.threadBasics;

public class RunnableInterfaceDemo implements Runnable{

	@Override 
	public void run() {
		try {
			System.out.println(Thread.currentThread());
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		
		RunnableInterfaceDemo r1 = new RunnableInterfaceDemo();
		
		Thread t1 = new Thread(r1);
		
		t1.start();
		
	}

}
