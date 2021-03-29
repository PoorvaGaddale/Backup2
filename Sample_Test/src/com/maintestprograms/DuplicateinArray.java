package com.maintestprograms
;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class DuplicateinArray {
	
	public static void main(String[] args) {
		int a[] = {4,5,4,5,4,5,7,7,9,4,5};
		
		
		HashMap<Integer, Integer> hp = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < a.length; i++) {
			if(!hp.containsKey(a[i])){
			hp.put(a[i], 1);
			System.out.println(a[i]);
			}
			else{
				System.out.println(a[i]+" duplicate");
				int k=hp.get(a[i]);
				System.out.println(k);
				hp.put(a[i], k+1);
			}
		}
		System.out.println(hp);
		
		/*HashSet<Integer> hs = new HashSet<Integer>();
		HashSet<Integer> hs1 = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			if(!hs.contains(a[i])){
				hs.add(a[i]);
			}
			else{
				hs1.add(a[i]);
			}
		}
		System.out.println(hs1);
		System.out.println(hs);*/
		
		
	/*	ArrayList<Integer> a1 = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			int k=0;
			
			if(!a1.contains(a[i])){
				a1.add(a[i]);
				k++;
			
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j]){
					k++;
				}
			}
			System.out.println(a[i]);
			System.out.println(k);
			if(k==1){
			System.out.println(a[i]+" is unique number");
			}
		}		
	}*/
	}
}
