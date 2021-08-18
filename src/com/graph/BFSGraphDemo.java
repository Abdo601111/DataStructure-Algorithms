package com.graph;

public class BFSGraphDemo {

	public static void main(String[] args) {



        BFSGraph d= new BFSGraph(6);
        d.addNode(0,1);
        d.addNode(0,2);
        d.addNode(1,0);
        d.addNode(1,3);
        d.addNode(1,4);
        d.addNode(3,1);
        d.addNode(4,1);
        d.addNode(2,0);
        d.addNode(2,5);
        d.addNode(5,2);
        d.BFCExplore(5);


	}

}
