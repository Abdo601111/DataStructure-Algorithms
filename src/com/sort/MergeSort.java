package com.sort;

public class MergeSort {

	int[] array;
	int[] tempArray;
	
	public static void main(String[] args) {


		int []arr= {1,10,3,6,19,5,15,33,4,9};
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+"\t");
			
			new MergeSort().prepareForSort(arr);
		}
		
	}
	
	void prepareForSort(int[] arr) {
		this.array=arr;
		this.tempArray= new int[arr.length];
		
		doMerageSort(0,arr.length);
	}

	private void doMerageSort(int lowerIndex, int hightIndex) {
		if (lowerIndex<hightIndex) {
		
		int meddle= lowerIndex+(hightIndex-lowerIndex)/2;
		doMerageSort(hightIndex,meddle);
		doMerageSort(meddle+1,hightIndex);
		MeragePart(lowerIndex,meddle,hightIndex);
		
		
		}
	}

	private void MeragePart(int lowerIndex, int meddle, int hightIndex) {
		// TODO Auto-generated method stub
		for (int i = lowerIndex; i <hightIndex; i++) {
			tempArray[i]=array[i];
			int I = lowerIndex;
			int j= meddle+1;
			int k= lowerIndex;
			while (I<=meddle && j<=hightIndex) {
				if (tempArray[I] <= tempArray[j]) {
					array[k]= tempArray[I];
					I++;
				}else {
					
					array[k]= tempArray[j];
					j++;
				}
				k++;
				
				
			}
			
			while(I<=meddle) {
				array[k]= tempArray[I];
				
			}
		}
	}

}
