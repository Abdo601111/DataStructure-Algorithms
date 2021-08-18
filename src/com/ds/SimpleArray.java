package com.ds;

public class SimpleArray {
	
	
	public static void main(String[] args) {
		
		int[] numbers  = new int[5];
		numbers[0]=66;
		numbers[1]=56;
		numbers[2]=226;
		numbers[3]=16;
		numbers[4]=22;
		
		System.out.println("Simple Array");
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i] + "\t");
		}
		
		System.out.println("Object Array");
		Student[] s = new Student[3];
		
		s[0] = new Student(1, "Egypt") ;
		s[1] = new Student(2, "Soudia Aribia") ;
		s[2] = new Student(3, "Soudan") ;
		
		for (Student student : s) {
			System.out.println(student.getName() +":" + student.getId());
		}
		
		
		
		System.out.println("Tow Dimsion Array");
		int [] [] data= new int [3][3];
		
		data[0][0]=2;
		data[0][1]=22;
		data[0][2]=3;
		data[1][0]=33;
		data[1][1]=4;
		data[1][2]=44;
		data[2][0]=5;
		data[2][1]=55;
		data[2][2]=50;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(data[i][j]);
				
			}
			
		}
	}

}
