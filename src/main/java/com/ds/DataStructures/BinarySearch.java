package com.ds.DataStructures;

import java.util.Scanner;

public class BinarySearch {

	public static int search(int arr[], int data){
		
		int low = 0;
		int high = arr.length;
		int mid;
		while(low<=high){
			mid = (high + low) /2;
			if(data == arr[mid]){
				System.out.println(data);
				return data;
			} else if(data < arr[mid]){
				high = mid -1;
			} else {
				low = mid +1;
			}
		}
		System.out.println(-1);
		return -1;
	}
	
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		int search = scanner.nextInt();
		int length = String.valueOf(input).length();
		int inputArr[] = new int[length];
		while(input != 0){
			length--;
			inputArr[length] = input % 10;
			input = input / 10;
		}
		search(inputArr, search);
		scanner.close();
	}
}
