package com.array;

import java.util.ArrayList;

class IntClass {
	private String myValue;

	public IntClass(String myValue) {
		this.myValue = myValue;
	}

	public String getMyValue() {
		return myValue;
	}				
}

public class ArrayTest {
	
	
	public static void main(String[] args) {
		
		String[] strArray = new String[5];
		int[] intArray = new int[10];
		
		ArrayList<String> strArrayList = new ArrayList<>();
		strArrayList.add("Tim");
		
		//ArrayLit<int> intArrayList = new ArrayList<>(); int do not have class
		
		ArrayList<IntClass> intClassArrayList = new ArrayList<>();
		intClassArrayList.add(new IntClass("Tim"));
		
		ArrayList<Integer> intArrayList = new ArrayList<>();	
		
		for(int i = 0;i < 10;i++){
			intArrayList.add(Integer.valueOf(i));
		}
		
		for(int i = 0;i < 10;i++){
			System.out.println(i + " --> " + intArrayList.get(i).intValue());
		}
		Integer myIntValue1 = new Integer(76);
		
		Integer myIntValue = 56;
		
		Double doubleValue = 22.67;
		
		int a = myIntValue.intValue(); // myIntValue
	}

}