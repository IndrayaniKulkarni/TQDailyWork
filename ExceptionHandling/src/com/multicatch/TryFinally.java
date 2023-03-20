package com.multicatch;

public class TryFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ar[] = {2,3,45,5};
		try {
			for(int i=0; i<ar.length; i++) {
				System.out.println(ar[i]+ar[i+1]);
			}
		}
		//catch handled by jvm
		finally {
			System.out.println("after code");
		}
	}

}
