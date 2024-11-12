package com.Array.Assignment;

//Condition to check the number is in between 30 and 50 or not
public class RangeCheck {

	public static void main(String[] args) {

		boolean values = num(35);
		System.out.println(values);

	}

	public static boolean num(int i) {

		return i > 30 && i < 50;
	}

}
