package com.maintestprograms;

public class FibonacciSeries {
	public static void main(String[] args) {
		int n=8;
		int a=0;
		int b=1;
		int sum;
		
		for (int i = 1; i <= n; i++) {
			sum=a+b;
			a=b;
			b=sum;
			System.out.println(sum);
		}
		
	}

}
