package com.ds;

public class StackArrayDemo {
	
	public static void main(String[] args) {
		
		
		System.out.println("Stack Array");
		StackArray<Integer> sr= new StackArray<Integer>(10);
		
		sr.push(22);
		sr.push(222);
		sr.push(235);
		sr.push(561);
		  System.out.println("Size : "+sr.top);
    System.out.println(sr.pop());
    
    
    
    System.out.println("Dynamic Stack Array");
	StackArrayDynamic<Integer> sd= new StackArrayDynamic<Integer>(4);
	
	sd.push(22);
	sd.push(222);
	sd.push(235);
	sd.push(561);
	System.out.println("Size : "+sd.arrayStack.length);
	sd.push(666);
	System.out.println("Size : "+sd.arrayStack.length);
System.out.println(sd.pop());
    
	}

}
