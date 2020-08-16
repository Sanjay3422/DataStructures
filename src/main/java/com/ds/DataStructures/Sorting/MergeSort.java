package com.ds.DataStructures.Sorting;

import java.util.Scanner;

public class MergeSort {

	public static void sort(int input[]){
		int left = 0;
		int right = input.length-1;
		int[] temp = new int[input.length];
		merge(input,temp, left, right);
	}
	
	private static void merge(int input[],int temp[], int left, int right){
		int mid;
		if(left < right){
			mid = (left + right)/2;
			merge(input,temp, left, mid);	
			merge(input, temp, mid +1, right);
			mergeSort(input, temp, left, mid +1, right);
		}
	}

	private static void mergeSort(int input[],int temp[], int left, int mid, int right) {
		int left_end = mid-1;
		int temp_pos =left;
		int size = right - left + 1;
		while((left <= left_end) && (mid <= right)){
			if(input[left] <= input[mid]){
				temp[temp_pos] = input[left];
				temp_pos++;
				left++;
			} else {
				temp[temp_pos] = input[mid];
				temp_pos++;
				mid++;
			}
		}
		while(left <= left_end){
			temp[temp_pos] = input[left];
			temp_pos++;
			left++;
		}
		while(mid <= right){
			temp[temp_pos] = input[mid];
			temp_pos++;
			mid++;
		}
		for(int i =0; i< size; i++){
			input[right] = temp[right];
			right--;
		}
		for(int i =0; i< size; i++){
			System.out.print(input[i]);
		}
		System.out.println();
	}
	

	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		Integer input = scanner.nextInt();
		int length = input.toString().length();
		int inputArr[] = new int[length];
		while(input != 0){
			length--;
			inputArr[length] = input % 10;
			input = input / 10;
		}
		sort(inputArr);
		scanner.close();
	}

}
