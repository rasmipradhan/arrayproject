package com.array;

import java.util.Scanner;

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int[] myIntegers = getIntArray(5);
		
		for(int i = 0;i < myIntegers.length; i++){
			System.out.println("Element " + i + " typed value was " + myIntegers[i]);
		}
		
		System.out.println("Average is " + getAverage(myIntegers));
	}
	
	public static int[] getIntArray(int number){
		System.out.println("Enter " + number + " integers values.\r");
		int[] values = new int[number];
		
		for(int i = 0; i < values.length; i ++){
			values[i] = scanner.nextInt();
		}
		
		return values;
	}
	
	public static double getAverage(int[] arr){
		int sum = 0;
		
		for(int a : arr){
			sum += a;
		}
		
		return (double) sum/ (double) arr.length;
	}
	
}
