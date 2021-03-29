package com.maintestprograms;

public class SumOfElementts {
	public static void main(String[] args) {
		int[] a = {1,5,8,4,5};
		
		int sum=sumArray(a);
		System.out.println(sum);
	}

	private static int sumArray(int[] a) {
		int sum=0;
		
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
		}
		return sum;
	}
	

}
