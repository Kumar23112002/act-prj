package com.Array.Assignment;

//Condition to check the number divisible by both 3 and 5 or not
public class DivisibleBy3_5 {

	public static void main(String[] args) {

		boolean values = num(15);
		System.out.println(values);

	}

	public static boolean num(int i) {

		return i % 3 == 0 && i % 5 == 0;
	}

}
