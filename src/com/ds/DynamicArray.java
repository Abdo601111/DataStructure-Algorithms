package com.ds;

import java.util.Arrays;

public class DynamicArray <T>{

	Object[] data;
	int size;
	
	public DynamicArray() {
		size=0;
		data = new Object [1];
	}
	
	public int getSize() {
		return data.length;
	}
	
	public T get(int index) {
		
		return (T) data[index];
	}
	
	public void put(int element) {
		ensureCapacity(size+1);
		data[size++] = element;
		
	}
	
	
	public void ensureCapacity(int maincapacity) {
		
		int oldCapacity = data.length;
		if(maincapacity > oldCapacity ) {
			int newCapacity = oldCapacity*2;
			if( newCapacity< maincapacity) {
				newCapacity= maincapacity;
			}
			data = Arrays.copyOf(data, newCapacity);
			
		}
		
	}
	
	
}
