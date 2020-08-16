package com.ds.DataStructures.Sorting;

import java.util.Scanner;

public class RadixSort {

	public static void sort(int input[], int maxNum){
		int div = 1;
		while(maxNum != 0){
			input = countingSort(input, input.length, div);
			div = div *10;
			maxNum = maxNum/10;
		}
		for(int i=0; i< input.length; i++){
			System.out.print(input[i]);
		}
		System.out.println();
	}
	
	public static int[] countingSort(int input[], int n, int div){
		int k = 10; // max of input elements
		int i,j;
		
		int auxiliary[] = new int[k];
		int sortedArray[] = new int[n];
		
		// storing number of occurrences of each element
		for(j = 0; j<n; j++){
			auxiliary[(input[j]/div)% k]++;
		}
		
		for(i=1; i<k; i++){
			auxiliary[i] = auxiliary[i] + auxiliary[i-1];
		}
		
		for(i=n-1;i>=0;i--)
        {
            sortedArray[auxiliary[(input[i]/div)%k]-1]= input[i];
            auxiliary[(input[i]/div)%k]--;
        }
		for(i=0;i<n;i++){
			input[i]= sortedArray[i];
		}
		return sortedArray;
	}
	
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int input[]= new int[5];
		int max =0;
		for(int i=0; i< 5; i++){
			input[i] = scanner.nextInt();
			if(input[i] > max){
				max = input[i];
			}
		}
		sort(input, max);
		scanner.close();
	}
}
