package com.datastructure;

public class RawLinkedList {
	
	class Node {
		 int value;
		 Node nextNode; //pointer to next node
		
		 Node (int value){
			this.value=value;			
		}
	}
	
	//two pointers, one for head node and another for tail node
	private Node head=null;
	private Node tail = null;
	
	public void add(int value) {
		Node newNode =  new Node(value);
		
		//if list is empty, make head node antail npde as new node
		if (head == null) {
			head = newNode;
			tail= newNode;
		} 
		else {
			//new node will be added next to tail node
			tail.nextNode = newNode;
			tail =newNode;
		}		
	}
	
	public void getAll() {
		Node current =  head;
		if (head ==null)
			return;

		while (current != null){
			System.out.println(current.value);
			current=current.nextNode;			
		}
	}

	public static void main(String[] args) {
		RawLinkedList list = new RawLinkedList();
		list.add(23);;
		list.add(45);
		list.getAll();
	}
	
}
