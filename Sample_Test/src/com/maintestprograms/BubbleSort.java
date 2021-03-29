package com.maintestprograms;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[]={36, 47, 100, 20, 300};
		BubbleSort bs = new BubbleSort();
		bs.bubbleSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public void bubbleSort(int[] arr){
		//int n=arr.length;
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j-1]>arr[j]){
					temp = arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
	}

}
