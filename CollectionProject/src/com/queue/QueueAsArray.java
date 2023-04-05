package com.queue;

class MyQueue{
	int rear, front;
	int size;
	int que[];
	
	MyQueue(){
	}
	MyQueue(int size){
		this.rear = 0;
		this.front = 0;
		this.size = size;
		que = new int[size];
	}
	
	public void insert(int val) {
		if(rear<size) {
			que[rear++]=val;
		}
		else {
			System.out.println("Queue is overflow");
		}
	}
	
	public void delete() {
		int temp;
		if(rear > front) {
			System.out.println("Element deleted = "+que[front]);
			
			for(temp = front; temp<rear-1; temp++) {
				que[temp] = que[temp+1];
			}
			que[--rear]=0;
		}
	}
	public void display() {
		if(rear>front) {
			for(int i=front; i<rear; i++) {
				System.out.println(que[i]);
			}
		}
		else {
			System.out.println("Queue is empty.");
		}
	}
}
public class QueueAsArray {

	public static void main(String[] args) {
		
		MyQueue q = new MyQueue(5);
		q.insert(10);
		q.insert(20);
		q.display();
		q.delete();
		q.display();
	}

}
