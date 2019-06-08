package com.array;

import java.util.Scanner;

public class MinElementChallenge {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println("Enter count");
		int count = scanner.nextInt();
		scanner.nextLine();
		
		int[]returnedArrya = readInteger(4);
	}
	
	public static int[] readInteger(int count){

		int[]array = new int[count];
		for(int i =0; i< array.length; i++){
			System.out.println("Enter a number");
			array[i] = scanner.nextInt();
			scanner.nextLine();//process the enter key
		}
		
		return array;
	}
	
	public static int findMin(int[] array){
		
		int min = Integer.MAX_VALUE;
		for(int i = 0; i<array.length;i++){
			
		}
		
		return 0;
		
	}

}
