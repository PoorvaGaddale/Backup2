package com.maintestprograms;

public class StringSwap {
	public static void main(String[] args) {
		String a="xyz";
		String b="pqr";
		a=a+b;//important
		b=a.substring(0, (a.length()-b.length()));
		a=a.substring(b.length(), (a.length()));
		System.out.println("a="+a+" b="+b);
	}

}
