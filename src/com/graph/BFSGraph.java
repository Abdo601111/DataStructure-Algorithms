package com.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BFSGraph {


	
	int size;
	AdjList[] array;
	public BFSGraph(int size) {
		
		this.size=size;
		array= new AdjList[this.size];
		
		for (int i = 0; i < size; i++) {
			array[i] = new AdjList();
			array[i].head=null;
		}
	}
	
	public void addNode(int src,int dest) {
		
		Node node = new Node(dest, null);
		node.next=array[src].head;
		array[src].head=node;
	}
	
	public void BFCExplore(int startVertex) {
		Boolean[] visited= new Boolean[size];
		for (int i = 0; i <size; i++) 
			visited[i]=false;
		
		
		Queue<Integer> s= new LinkedList<Integer>();
		s.add(startVertex);
		while(!s.isEmpty()) {
			int n= s.poll();
			System.out.println("visit "+n);
			
			visited[n]=true;
			Node head = array[n].head;
		
			while(head!=null) {
				
				if(visited[head.dest]==false) {
					s.add(head.dest);
				visited[head.dest]=true;
				
			}else
				head=head.next;
			}
			
		}
	}
		
		
		

}
