package com.graph;

public class BinaryTree {

	NodeTree root;

	public BinaryTree(NodeTree root) {
		super();
		this.root = root;
	}
	
	
	public void addNode(NodeTree newNode,NodeTree rootExplore) {
		if(rootExplore==null) return;
		
		if(newNode.value>rootExplore.value) {
			if(rootExplore.right==null)
				rootExplore.right=newNode;
			else
				addNode(newNode,rootExplore.right);
		}
		
		if(newNode.value<rootExplore.value) {
			if(rootExplore.left==null)
				rootExplore.left=newNode;
			else
				addNode(newNode,rootExplore.left);
		}
		
	}
	
	public void search(int value,NodeTree rootExplore) {
		if(rootExplore==null) {
			System.out.println("Value Can Not Founded");
			return;
		} 
		
		if(rootExplore.value==value) {
			System.out.println("Value Is Founded");
			return;
		}
		
		if(value>rootExplore.value) {
			
			search(value,rootExplore.right);
		}
		
		if(value<rootExplore.value) {
			
			search(value,rootExplore.left);
		}
	}
	
	
}
