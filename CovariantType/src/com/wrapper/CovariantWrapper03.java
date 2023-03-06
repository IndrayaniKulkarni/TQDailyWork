package com.wrapper;

class Parent {
	Number num = 10;
//	Number print() { //cannot convert int to bool
//		return num;
//	}
    
	Object print() {
		return num;
	}
}

class Child extends Parent {
	boolean bool = true;// can not convert int to bool

	Object print() {
		return bool;
	}
}

public class CovariantWrapper03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent p = new Parent();
		System.out.println(p.print());
		
		Child c = new Child();
		System.out.println(c.print());
	}

}
