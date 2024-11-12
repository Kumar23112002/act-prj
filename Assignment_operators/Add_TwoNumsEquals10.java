package com.Array.Assignment;

//Condition to check sum of 2 numbers equal to 10 or not
public class Add_TwoNumsEquals10 {

	public static void main(String[] args) {

		boolean values = num(1, 9);
		System.out.println(values);

	}

	public static boolean num(int i, int j) {

		return i + j == 10;
	}

}
