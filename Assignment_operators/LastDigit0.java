package com.Array.Assignment;

//Condition to check the last digit of Number is 0 or not
public class LastDigit0 {

	public static void main(String[] args) {

		boolean values = num(50);
		System.out.println(values);

	}

	public static boolean num(int i) {

		return i % 10 == 0;
	}

}
