package com.ds;

public class StackArray <T>{
	
	int size;
	Object[] arrayStack;
	int top;
	public StackArray(int size) {
		this.size=size;
		arrayStack= new Object[this.size];
		top=-1;
		
	}
	
	public void push(int newItem) {
		if(isFull()) {
			System.out.println("Stack Is Full");
			
			return;
		}
			
		top=top+1;
		arrayStack[top] = newItem;
		
	}
	
	public T pop() {
		
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return null;
		}
		T item  = (T) arrayStack[top];
		top = top-1;
		return item;
	}
	
	
	public boolean isFull() {
		
		return (top==size-1);
	}
	
public boolean isEmpty() {
		
		return (top==-1);
	}

}
