package com.ds.DataStructures.Sorting;

public class QuickSort {

	public static void sort(int input[]){
		int low = 0;
		int high = input.length-1;
		int[] temp = new int[input.length];
		quick(input, low, high);
	}
	
	public static void quick(int input[], int low, int high){
		int pivot;
		if(low < high){
			pivot = partition(input, low, high);
			quick(input, low, pivot -1);
			quick(input, pivot + 1, high);
		}
	}
	
	public static int partition(int input[], int low, int high){
		int pivot = input[low];
		int left = low;
		int right = high;
		while(left< right){
			while(input[left] <= pivot){
				left++;
			}
			while(input[right] > right){
				right++;
			}
			if(left<right){
				int temp = input[left];
				input[left] = input[right];
				input[right] = temp;
			}
		}
		input[low] = input[right];
		input[right] = pivot;
		return right;
	}
}
