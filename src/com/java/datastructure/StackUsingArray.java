package com.java.datastructure;

class Stack{
	int stack[] = new int[5];
	int top;
	
	void push(int data) {
		this.stack[top]=data;
		this.top++;
	}
	
	int pop() {
		this.top--;
		int x = this.stack[top];
		
		return x;
	}
	    
}
public class StackUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(40);
		System.out.println(stack.pop());
		stack.push(50);
		stack.push(60);
		
		
		System.out.println(stack.pop());
		
	}

}
