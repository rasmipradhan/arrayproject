package com.array;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1, 5, 3, 7, 11, 9, 15};
		System.out.println("Array = " + Arrays.toString(array));
		
		int[] reversedArr = reverse(array);
		System.out.println("Array = " + Arrays.toString(reversedArr));

	}
	
	public static int[] reverse(int[] arr){
		int[] reversedArr = new int[arr.length];
		
		int a = 0;
		for(int i = arr.length -1; i >= 0; i--){
			reversedArr[a]= arr[i];
			a++;
		}
		
		return reversedArr;
	}

}
