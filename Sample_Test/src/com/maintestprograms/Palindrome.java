package com.maintestprograms;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        int l=str.length();
        String reverse="";
        for(int i=l-1;i>=0;i--) { 
              reverse = reverse + str.charAt(i);
        }                             
        if(str.equals(reverse)) {
              System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
  }
	}

