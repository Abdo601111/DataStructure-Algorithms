package com.search;

public class InterPolationSearch {
	
	public static void main(String[] args) {
		
		
		int size =10000000;
		int[] numbers= new int[size];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i+1;
		}
		
		int numberSearching=0;
		int low=0;
		int hight=numbers.length-1;
		int mid=0;
		int searchNumber= 999;
		
		boolean isFull=false;
		
		while(!isFull) {
			
			if(low>hight) {
				System.out.println("Numbers not Found");
				break;
			}
			
			mid=low+((hight-low)/(numbers[hight]-numbers[low]))*(searchNumber-numbers[low]);
			numberSearching++;
			if(numbers[mid]==searchNumber) {
				System.out.println("Number is Found");
				System.out.println("Number " +numberSearching);
				break;
			}
			
			if(numbers[mid]<searchNumber) {
				low=mid+1;
			}
			
			if(numbers[mid]>searchNumber) {
				hight=mid-1;
			}
			
		}
		
		
	}

}
