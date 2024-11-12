package com.Array.Assignment;

//Condition to check the number is Even or not
public class CheckEvenNum {

	public static void main(String[] args) {

		boolean values = num(3);
		System.out.println(values);

	}

	public static boolean num(int i) {

		return i % 2 == 0;
	}

}
