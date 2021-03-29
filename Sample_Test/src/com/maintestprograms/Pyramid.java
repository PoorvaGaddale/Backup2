package com.maintestprograms;

public class Pyramid {

	public static void main(String[] args) {
		//int k=1;
		
		/*for (int i = 0; i <=4; i++) {
			
			for (int j = 1; j <=4-i; j++) {
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
			
		}*/
		
		//Half Pyramid
		/*for (int i = 1; i <= 5; i++) {
			
			for (int j = 1; j <= i; j++) {
				//System.out.print(k+" ");
				//k++;
				//System.out.print(j+" ");
				System.out.print("* ");
			}
			System.out.println();
		}*/
		
		//Inverted Half Pyramid
		/*for (int i = 4; i >=0; i--) {
			
			for (int j = 1; j <=i; j++) {
				//System.out.print(k+" ");
				//k++;
				
				//System.out.print("* ");
				System.out.print(j+" ");
			}
			System.out.println();
			
		}*/
		
		//Full Pyramid
	/*	for (int i = 0; i < 5; i++) {
			
			for (int j =0 ; j <=5-i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}*/
		
		for (int i = 0; i < 5; i++) {
			
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//Inverted full pyramid
		for (int i = 5; i >= 0; i--) {
			
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*"+" ");
				//System.out.println(j);
			}
			System.out.println();
		}
		
	}

}
