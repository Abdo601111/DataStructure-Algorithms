package com.ds;

public class QueueLinkedList<T> {

	
	
	NodeDouble<T> Rear;
	NodeDouble<T> Front;
	
	
	
	public QueueLinkedList(NodeDouble newNode) {
		
		Rear=newNode;
		Front=newNode;
	}
	
	public void queue(NodeDouble newNode) {
		
		newNode.next=null;
		newNode.prevous=Rear;
		Rear.next=newNode;
		Rear=newNode;
	}
	
	public T Dequeue() {
    T value= Front.value;
	Front= Front.next;
	Front.prevous=null;
	return value;
	}
	

	
}
