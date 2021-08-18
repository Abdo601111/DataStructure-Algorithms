package com.ds;

public class Enter <T>{
	
	int key;
	T value;
	Enter next;
	
	public Enter(int key,T value) {
		
		this.key=key;
		this.value=value;
		this.next=null;
	}

public Enter() {
		
		
		this.next=null;
	}

	
	public int getKey() {
		return key;
	}

	public T getValue() {
		return value;
	}
	
	

}
