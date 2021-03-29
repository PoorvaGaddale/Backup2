package com.maintestprograms;

public class SelectionSort {

	public static int[] sortArray(int[] arr){
        
        for (int i = 0; i < arr.length - 1; i++) {
             int index = i;
             for (int j = i + 1; j < arr.length; j++) {
                  if (arr[j] < arr[index]) {
                     index = j;
                  }
             }
   
             int minNumber = arr[index];  
             arr[index] = arr[i];
             arr[i] = minNumber;
        }
        return arr;
   }

   public static void printArray(int[] arr) {
        for (int i=0; i<arr.length; i++) {
             System.out.print(arr[i]+" ");
        }
   }
  
   public static void main(String a[]){
      
          int[] arr1 = {8,10,2,43,12,92,58,62};
          System.out.println("Array before Sorting,");
          printArray(arr1);
          System.out.println("");
          int[] arr2 = sortArray(arr1);
          System.out.println("Array after sorting,");
          printArray(arr2);
   }
}
