package com.ds.DataStructures.Sorting;

import java.util.Scanner;

public class BubbleSort {
	
	public static void sort(int input[]){
		
		int i;
		for(int step = input.length -1; step>=0; step--){
			for(i = 0; i< step; i++){
				if(input[i] > input[i+1]){
					int temp = input[i];
					input[i] = input[i+1];
					input[i+1] = temp;
				}
			}
		}
		
		for(i = 0; i < input.length; i++){
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
