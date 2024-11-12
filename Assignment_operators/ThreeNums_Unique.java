package com.Array.Assignment;

//Condition to check the 3 numbers are unique or not
public class ThreeNums_Unique {

	public static void main(String[] args) {
		boolean values = num(3, 4, 5);
		System.out.println(values);

	}

	public static boolean num(int i, int j, int k) {

		return i != j || j != k || k != i;
	}

}
