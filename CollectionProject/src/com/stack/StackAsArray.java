package com.stack;

class MyStack{
	int top;
	int size;
	int [] stk;
	
	MyStack(){}
	MyStack(int size){
		this.size = size;
        top = -1;
        stk = new int[this.size];
	}
	void push(int data) {
		if(top<size-1) {
			top++;
			stk[top] = data;
			System.out.println("Element inserted...");
		}
		else {
			System.out.println("Stack overflow..");
		}
		
	}
	int pop() {
		if(top!=-1) {
			return stk[top--];
		}
		else {
			System.out.println("Stack underflow..");
			return -1;
		}
	}
	void show() {
		if(top!=-1) {
			for(int i=0; i<top; i++) {
				System.out.print(stk[i]+" ");
			}
		}
		else {
			System.out.println("Empty stack");
		}
	}
}
public class StackAsArray {

	public static void main(String[] args) {
		
		MyStack st = new MyStack(4);
		st.show();
		st.push(10);
		st.push(20);
		st.push(40);
		st.push(30);
		st.show();
		System.out.println("\n pop \n"+st.pop());
		System.out.println("After pop");
		st.show();
		System.out.println("\n callpop \n"+st.pop());
		System.out.println("After pop");
		st.show();
		System.out.println("\n callpop \n"+st.pop());
		System.out.println("After pop");
		st.show();
		System.out.println("\n callpop \n"+st.pop());
		System.out.println("After pop");
		st.show();
	}

}
