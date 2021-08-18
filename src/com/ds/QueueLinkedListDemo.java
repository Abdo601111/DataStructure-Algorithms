package com.ds;

public class QueueLinkedListDemo {
	
	public static void main(String[] args) {
		
		
		NodeDouble<Integer> node= new NodeDouble<Integer>(12, null, null);
		
		QueueLinkedList<Integer> queue= new QueueLinkedList<>(node);
		queue.queue(new NodeDouble<Integer>(13, null, null));
		queue.queue(new NodeDouble<Integer>(14, null, null));
		queue.queue(new NodeDouble<Integer>(15, null, null));
		queue.queue(new NodeDouble<Integer>(16, null, null));
		System.out.println(queue.Dequeue());
	}

}
