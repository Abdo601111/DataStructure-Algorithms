package com.ds;

public class NodeDouble<T> {

	T value;
	NodeDouble next;
	NodeDouble prevous;
	
	public NodeDouble(T value,NodeDouble next,NodeDouble prevous) {
		
		this.value=value;
		this.next=next;
		this.prevous=prevous;
	}
	
}
