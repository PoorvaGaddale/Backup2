package com.maintestprograms;

public class ReplaceCharacter {
	
	public static void main(String[] args) {
		String a="Sofware";
		String[] a1=a.split("");
		String ch="";
		for (int i = 0; i < a1.length; i++) {
			if(a1[i].equals("w")){
				ch=ch+"g";
			}
			else {
				ch=ch+a1[i];
			}
				
		}
		System.out.println(ch);	
		ReplaceCharacter.countLetter("ggg9998");
	}

	public static void countLetter(String s) {                                      
        if(s==null) {
             return;
        }                                         
        int counter=0;                                      
        for(int i=0;i<s.length();i++) {
            if (Character.isLetter(s.charAt(i))) {                                                      
               counter++;
            }
        }                                      
        System.out.println(counter);
   }
}
