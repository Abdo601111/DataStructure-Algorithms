package com.ds;

public class HashTableArray<T> {
	
	Enter[] ArrayHash;
	int Size;
	
	public HashTableArray(int Size) {
		this.Size=Size;
		ArrayHash = new Enter[this.Size];
		for (int i = 0; i < ArrayHash.length; i++) {
			ArrayHash[i] = new Enter<>();
		}
		
	}
	
	int GetHash(int Key) {
		
		return Key%Size;
	}
	
	public void put(int key,T value) {
		
		int index = GetHash(key) ;
		Enter arrayValue=ArrayHash[index];
		Enter newValue= new Enter<T>(key, value) ;
		newValue.next=arrayValue.next;
		arrayValue.next=newValue;
	}
	
	public T get(int key) {
		T value = null;
		int index = GetHash(key) ;
		Enter arrayValue=ArrayHash[index];
		
		while(arrayValue.next!=null) {
			if(arrayValue.getKey()==key) {
				value= (T)arrayValue.getValue();
				break;
				
			}
			
			arrayValue=arrayValue.next;
		}
		
		
		return value;
		
		
	}

}
