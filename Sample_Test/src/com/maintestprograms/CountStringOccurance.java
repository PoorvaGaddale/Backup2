package com.maintestprograms;

public class CountStringOccurance {
	
	public static void main(String[] args) {
		int count=countOccurance("aaagbaaqadt",'a');
		System.out.println(count);
	}


	private static int countOccurance(String s, Character c) {
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)==c){
				count++;
			}
		
		}
		
		return count;
	}
	

}
