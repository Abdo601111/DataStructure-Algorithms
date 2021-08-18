package com.ds;

public class QueueArray<T> {
	
	Object [] ArrayQueue;
	int Rear;
	int Front;
	int Size;
	
	public QueueArray(int Size) {
		
		this.Size=Size;
		ArrayQueue = new Object[Size];
		Rear=-1;
		Front=-1;
	}
	
	boolean isFull() {
		return (Rear == Size-1);
	}
	
	boolean isEmpty() {
		return (Front==-1 || Front > Rear);
	}

	
	public void Queue(Object newItem) {
  if (isFull()) {
	
	  System.out.println("Queue is Full");
	  return;
  } 
		
		Rear = Rear+1;
		ArrayQueue[Rear] =  newItem;
		if(Front == -1)
			Front =0;
		
	}
	
	
public T DeQueue() {
	if(isEmpty()) {
		System.out.println("Queue is Empty");
		return null;
	}
	T objectOut = (T)ArrayQueue[Front];
	Front = Front +1;
	return objectOut;
		
	}
	

}
