package com.ds.DataStructures.Sorting;

import java.util.Scanner;

public class SelectionSort {

	private static void sort(int input[]){
		
		int i;
		for(i =0; i< input.length; i++){
			int min = i;
			for(int j = i+1; j< input.length; j++){
				if(input[min] > input[j]){
					min = j;
				}
			}
			if(min != i){
				int temp = input[i];
				input[i] = input[min];
				input[min] = temp;
			}
		}
		
		for(i=0; i< input.length; i++){
			System.out.print(input[i]);
		}
		System.out.println();
		String args[] = {"",""};
		main(args);
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
