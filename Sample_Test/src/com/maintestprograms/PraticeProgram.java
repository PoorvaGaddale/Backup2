package com.maintestprograms;

public class PraticeProgram {
	public static void main(String[] args) {

		/*for (int i=0; i<6; i++) //outer loop for number of rows(n)
        { 
        for (int j=6-i; j>1; j--) //inner loop for spaces
            { 
                System.out.print(" "); //print space
            }  
            for (int j=0; j<=i; j++ ) //inner loop for number of columns
            { 
                System.out.print("* "); //print star
            } 
  
            System.out.println(); //ending line after each row
        }*/ 
		
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		for (int i=0; i<5; i++)   
		{  
			
			for (int j=2*(4-i); j>=0; j--)         
			{  
				System.out.print(" ");   
			}   
			for (int j=0; j<=i; j++ )   
			{   
				System.out.print("* ");   
			}   
		System.out.println();   
		} 
		
		for (int i=0; i<5; i++)   
		{  
			
			for (int j=7-i; j>=i; j--)         
			{  
				System.out.print(" ");   
			}   
			for (int j=0; j<=i; j++ )   
			{   
				System.out.print("* ");   
			}   
		System.out.println();   
		} 
		
		//Pyramid
		
		for (int i=0; i<5; i++)   
		{  
			
			for (int j=5-i; j>=1; j--)         
			{  
				System.out.print(" ");   
			}   
			for (int j=0; j<=i; j++ )   
			{   
				System.out.print("* ");   
			}   
		System.out.println();   
		} 
		
		for (int i=5; i>=0; i--)   
		{  
			
			for (int j=5-i; j>=1; j--)         
			{  
				System.out.print(" ");   
			}   
			for (int j=0; j<=i; j++ )   
			{   
				System.out.print("* ");   
			}   
		System.out.println();   
		} 
		
		
    } 
		
}
