package com.ds;

import java.util.Arrays;

public class StackArrayDynamic <T>{

	
	int size;
	Object[] arrayStack;
	int top;
	public StackArrayDynamic(int size) {
		this.size=size;
		arrayStack= new Object[this.size];
		top=-1;
		
	}
	
	
	
public void ensureCapacity(int maincapacity) {
		
		int oldCapacity = arrayStack.length;
		if(maincapacity > oldCapacity ) {
			int newCapacity = oldCapacity*2;
			if( newCapacity< maincapacity) 
				newCapacity= maincapacity;
	          arrayStack = Arrays.copyOf(arrayStack, newCapacity);
			
		}
}
	
	public void push(int newItem) {
		
		
		 ensureCapacity(top+2);

//		if(isFull()) {
//			System.out.println("Stack Is Full");
//			
//			return;
//		}
			
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
