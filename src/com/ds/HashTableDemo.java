package com.ds;

public class HashTableDemo {
	
	public static void main(String[] args) {
		
		HashTableArray<String> ht= new HashTableArray<String>(10);
		
		ht.put(10, "abdo");
		ht.put(123, "mohamed");
		ht.put(12, "amira");
		ht.put(152, "assma");
		ht.put(15, "abdall");
		System.out.println(ht.get(152));
	}

}
