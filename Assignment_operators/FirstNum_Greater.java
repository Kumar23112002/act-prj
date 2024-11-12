package com.Array.Assignment;

//Condition to check First Number is greater than both Second & Third Numbers or Not
public class FirstNum_Greater {

	public static void main(String[] args) {

		boolean values = num(26, 23, 25);
		System.out.println(values);
	}

	public static boolean num(int i, int j, int k) {

		return i > j && i > k;
	}

}
