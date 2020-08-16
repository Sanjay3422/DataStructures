package com.ds.DataStructures.Sorting;

import java.util.Scanner;

public class InsertionSort {

	public static void sort(int input[]){
		int i,j;
		for(i = 1; i < input.length; i++){
			int value = input[i];
			j= i;
			while(j> 0 && value < input[j-1]){
				input[j] = input[j-1];
				j--;
			}
			input[j] = value;
		}
		
		for(i=0; i< input.length; i++){
			System.out.print(input[i]);
		}
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
