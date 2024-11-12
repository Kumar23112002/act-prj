package com.Array.Assignment;

//Condition to check the 3 numbers equal or not
public class ThreeNumsEqual {

	public static void main(String[] args) {

		boolean values = num(26, 26, 26);
		System.out.println(values);

	}

	public static boolean num(int i, int j, int k) {

		return i == j && i == k;
	}

}
