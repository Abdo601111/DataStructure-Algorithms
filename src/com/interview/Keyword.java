package com.interview;

import java.util.ArrayList;
import java.util.HashMap;

public class Keyword {

	public static void main(String[] args) {


		String text = "As well as well systems to catch and control substandard and vandalistic edits, Wikipedia also has a"
		+ " full style and content manual and various positive systems for continual article "
		+ "review and improvement.  improvement Examples  Examples Examples of the processes include";
		
		ArrayList<String> words= new ArrayList<>();
		HashMap<String, Integer> wordValed= new HashMap<>();
		words.add("and");
		words.add("to");
		words.add("as");
		words.add("a");
		words.add("for");
		
		String[] word= text.split(" ");
		int maxKey=0;
		for (String w : word) {
			String key=w.trim().toLowerCase();
			if(key.length()==0) {continue;}
			if(words.contains(key)) {continue;}
			
			
			if(wordValed.get(key)==null) {
				wordValed.put(key, 1);
			}else {
				int wordOld= wordValed.get(key);
				wordValed.put(key, wordOld+1);
				
			}
			int newKey= wordValed.get(key);
			if(newKey>maxKey) {
				maxKey=newKey;
				
			}
		}
		
		
		for (String key : wordValed.keySet()) {
			if(wordValed.get(key)==maxKey)
			System.out.println(key + "  :  " +wordValed.get(key));
		}
		
		
	}

}
