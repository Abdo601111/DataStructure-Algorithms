package com.sort;

public class QuickSort {

	
	
	static void quickSort(int[] arr, int low,int hight) {
		
		if(low>=hight ) return;
		
		int middle= low+(hight-low)/2;
		int pivot=arr[middle];
		int i=low;
		int j= hight;
		
		while(i<=j) {
			while(arr[i]<pivot) {
				i++;
			}
			while(arr[j]>pivot) {
				j--;
			}
			if(i<=j) {
				int temp =arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
		}
		
		if(low<j) 
			quickSort(arr,low,j);
		if(hight>i) 
			quickSort(arr,i,hight);
	}
	
	public static void main(String[] args) {

		int []arr= {1,10,3,6,19,5,15,33,4,9};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		
		}
		
		quickSort(arr,0,arr.length-1);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		
		}
	}

}
