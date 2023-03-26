package com.stack;

class CustStack{
	
	int top; // pointer to point curr ele
	int size; //static 
	int []stk;
	
	CustStack(){}
	
	CustStack(int size){
		top = -1;
		this.size = size;
		stk = new int[size];
	}
	
	void push(int val) {
		if(top<size-1) {
			top++;
			stk[top]=val;
		}
		else {
			System.out.println("Overflow");
		}
	}
	int pop() {
		if(top!=-1) {
			return stk[top--];
		}
		else {
			return -1;
		}
		
	}
	void displayAll() {
		for(int i=top; i>=0; i--) {
			System.out.println(stk[i]+" ");
		}
	}
}
public class StackAsArr2 {

	public static void main(String[] args) {
		
		CustStack st = new CustStack(5);
		st.displayAll();
		st.push(10);
		st.push(20);
		st.push(40);
		st.push(30);
		st.displayAll();
		System.out.println("\n pop \n"+st.pop());
		System.out.println("After pop");
		st.displayAll();
		System.out.println("\n callpop \n"+st.pop());
		System.out.println("After pop");
		st.displayAll();
		System.out.println("\n callpop \n"+st.pop());
		System.out.println("After pop");
		st.displayAll();
		System.out.println("\n callpop \n"+st.pop());
		System.out.println("After pop");
		st.displayAll();
		
	}

}
