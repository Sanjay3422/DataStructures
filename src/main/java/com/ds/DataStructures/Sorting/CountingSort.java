package com.ds.DataStructures.Sorting;

import java.util.Arrays;

public class CountingSort {

	public static void main(String args[]){
		
		int input[] = {4,1,3,5,2,2,2};
		input = Arrays.copyOf(input, 10);
		countingSort(input, 7);
	}
	
	public static int[] countingSort(int input[], int n){
		
		int k = 0; // max of input elements
		int i,j;
		for(i =0; i< n; i++){
			if(k < input[i]){
				k = input[i];
			}
		}
		
		int auxiliary[] = new int[k+1];
		int sortedArray[] = new int[n];
		
		// for(i =0; i<=k; i++){
		//	 auxiliary[i] = 0;
		// }
		
		// storing number of occurrences of each element
		for(j = 0; j<n; j++){
			auxiliary[input[j]]++;
		}
		
		j=0;
		for(i =0; i<=k; i++){
			int temp = auxiliary[i];
			
			while(temp !=0){
				sortedArray[j] = i;
				j++;
				temp --;
			}
		}
		print(sortedArray);
		return sortedArray;
	}
	
	private static void print(int sortedArray[]){
		int i;
		for (i=0; i< sortedArray.length; i++){
			System.out.print(sortedArray[i]);
		}
	}
}
