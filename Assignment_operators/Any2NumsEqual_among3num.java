package com.Array.Assignment;

//Condition to check any 2 numbers equal or not among the 3 numbers
public class Any2NumsEqual_among3num {

	public static void main(String[] args) {

		boolean values = num(3, 3, 3);
		System.out.println(values);

	}

	private static boolean num(int i, int j, int k) {

		return i == j || j == k || k == i;
	}

}
