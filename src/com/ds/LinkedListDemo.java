package com.ds;

public class LinkedListDemo {
	
	
	public static void main(String[] args) {
		
		LinkedList ls = new LinkedList(new Node(22,null));
		ls.add(new Node(55,null));
		ls.add(new Node(44,null));
		ls.add(new Node(33,null));
		ls.add(new Node(11,null));
		ls.display();
		
	}

}
