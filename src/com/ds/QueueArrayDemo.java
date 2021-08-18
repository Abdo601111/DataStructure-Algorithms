
package com.ds;

public class QueueArrayDemo {
	
	public static void main(String[] args) {
		QueueArray<String> queue= new QueueArray<>(5);
		queue.Queue("A");
		queue.Queue("B");
		queue.Queue("C");
		queue.Queue("D");
		System.out.println(queue.DeQueue());
	}

}
