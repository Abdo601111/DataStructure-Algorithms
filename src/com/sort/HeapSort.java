package com.sort;

public class HeapSort {

	static int total;
	static void Heapfiying(int[]arr,int parentIndex){
		int leftNodeIndex=parentIndex*2;
		int rightNode= parentIndex*2+1;
		int newIndex=parentIndex;
		
		if (leftNodeIndex<total && arr[leftNodeIndex]>arr[parentIndex]) 
			newIndex=leftNodeIndex;
		if (rightNode<total && arr[rightNode]<arr[parentIndex]) 
			newIndex=rightNode;
		if(newIndex!= parentIndex)
			swap(arr,parentIndex,newIndex);
		Heapfiying(arr,newIndex);
	}
	
	
	 static void swap(int[] arr, int parentIndex, int newIndex) {
		int temp = arr[parentIndex];
		arr[parentIndex]=arr[newIndex];
		arr[newIndex]=temp;
		
	}


	public static void main(String[] args) {
		
		

		int []arr= {1,10,3,6,19,5,15,33,4,9};
		for (int i = 0; i < arr.length; i++) 
			System.out.println(arr[i]+"\t");
		
		reSort(arr);
		for (int i = 0; i < arr.length; i++) 
			System.out.println(arr[i]+"\t");
		
		
	}
	
	static void reSort(int [] arr) {
		total=arr.length;
		for(int i=total/2;i>0;i--) 
			Heapfiying(arr,i);
		for(int i=total;i>=0;i--)
			swap(arr,0,i);
		total--;
		Heapfiying(arr,0);
		
	}
	
}
