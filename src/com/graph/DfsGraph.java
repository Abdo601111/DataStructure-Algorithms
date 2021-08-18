package com.graph;

import java.util.Stack;

public class DfsGraph {

	int size;
	AdjList[] array;
	public DfsGraph(int size) {
		
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
	
	public void DFCExplore(int startVertex) {
		Boolean[] visited= new Boolean[size];
		for (int i = 0; i <size; i++) 
			visited[i]=false;
		
		
		Stack<Integer> s= new Stack<Integer>();
		s.push(startVertex);
		while(!s.isEmpty()) {
			int n= s.pop();
			s.push(n);
			visited[n]=true;
			Node head = array[n].head;
			boolean isDone=true;
			while(head!=null) {
				
				if(visited[head.dest]==false) {
					s.push(head.dest);
				visited[head.dest]=true;
				isDone=false;
				break;
			}else
				head=head.next;
			}
			if(isDone==true) {
				int outN=s.pop();
				System.out.println("Visit Node  :" +outN );
			}
		}
	}
		
		
		
		public void search(int startVertex,int search) {
			Boolean[] visited= new Boolean[size];
			boolean isFound=false;
			for (int i = 0; i <size; i++) 
				visited[i]=false;
			
			
			Stack<Integer> s= new Stack<Integer>();
			s.push(startVertex);
			while(!s.isEmpty()) {
				int n= s.pop();
				s.push(n);
				visited[n]=true;
				Node head = array[n].head;
				boolean isDone=true;
				while(head!=null) {
				if(search==head.dest){
				System.out.println("Node Is Found");
				isFound=true;
				break;
					}
					
					if(visited[head.dest]==false) {
						s.push(head.dest);
					visited[head.dest]=true;
					isDone=false;
					break;
				}else
					head=head.next;
				}
				if(isFound==true) {
					break;
				}
				if(isDone==true) {
					int outN=s.pop();
					System.out.println("Visit Node  :" +outN );
				}
			}
			if(isFound==false){
				System.out.println("Node cannot Found");
				
					}
			
		
	}

}
