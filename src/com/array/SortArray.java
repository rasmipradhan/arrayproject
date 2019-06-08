package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] myIntegers = getIntegers(5);
		int[] sortedArray = sortArray(myIntegers);
		printArray(sortedArray);
	}
	
	public static int[] getIntegers(int number){
		System.out.println("Enter " + number + " integer values.\r");
		int[] values = new int[number];
		
		for(int i = 0;i < values.length;i++){
			values[i] = scanner.nextInt();
		}
		
		return values;
	}
	
	public static void printArray(int[] arr){
		for(int a : arr){
			System.out.println(a);
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static int[] sortArray(int[] arr){
		
		Arrays.sort(arr);
		  
		//int[] sortedArray = new int[arr.length];
		int[] sortedArray1 = Arrays.copyOf(arr, arr.length);
		int a = 0;
		for(int i = arr.length -1 ; i >= 0; i--){
			sortedArray1[a]= arr[i];
			a++;
		}
		
		return sortedArray1;
	}

}
