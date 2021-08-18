package com.graph;

public class BinaryTreeDemo {

	public static void main(String[] args) {

		NodeTree node= new NodeTree(7, null, null);
		BinaryTree bt= new BinaryTree(node);
		for (int i = 0; i < 10; i++) {
			NodeTree newNode8= new NodeTree(i, null, null);
			bt.addNode(newNode8, bt.root);
		}
		
		bt.search(11, bt.root);
		
		

	}

}
