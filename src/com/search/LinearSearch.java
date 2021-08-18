package com.search;

public class LinearSearch {
	public static void main(String[] args) {
		
		int size =10000000;
		int[] numbers= new int[size];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i+1;
		}
		
		int numberSearching=0;
		int searchNumber= 1111;
		
		for (int i = 0; i < size; i++) {
			numberSearching++;
			if (numbers[i]==searchNumber) {
				System.out.println("Number is Found");
				System.out.println(" Number Is Sershing " + numberSearching);
				break;
			}
			
		}
		
	}

}
