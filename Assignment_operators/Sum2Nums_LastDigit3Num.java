package com.Array.Assignment;

//Condition to check the sum of First 2 numbers equals to last digit of 3rd number or not 
public class Sum2Nums_LastDigit3Num {

	public static void main(String[] args) {
		boolean values = num(2, 3, 95);
		System.out.println(values);

	}

	public static boolean num(int i, int j, int k) {

		return i + j == k % 10;
	}

}
