package com.maintestprograms;

public class PrimeorNot {
	public static void main(String[] args) {
		int num=12185731;
		boolean Prime=false;
		
		for (int i = 2; i < num/2; i++) {
			if(num%i==0){
				Prime=true;
				break;
			}
		}
		if(Prime){
			System.out.println("Not Prime");
		}
		else{
			System.out.println("Prime");
		}
		
	}

}
