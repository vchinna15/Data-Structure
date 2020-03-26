package com.java.datastructure;

class Queue{
	int queue[] = new int[5];
	int front;
	int rear;
	
	
	void enqueue(int data) {
		this.queue[rear]=data;
		rear=(rear+1)%5;

	}
	int dequeue() {
		int x = this.queue[front];
		front=(front+1)%5;
		
		return x;
	}
}
public class QueueWithArray {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		q.enqueue(5);
		q.enqueue(10);
		q.enqueue(15);
		q.enqueue(20);
		q.enqueue(21);
		
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		q.enqueue(23);
		System.out.println(q.dequeue());
	}

}
