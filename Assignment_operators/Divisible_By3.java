package com.Array.Assignment;

//Condition to check the number divisible by 3 or not
public class Divisible_By3 {

	public static void main(String[] args) {
		boolean value = num(6);
		System.out.println(value);

	}

	public static boolean num(int i) {

		return i % 3 == 0;
	}

}
