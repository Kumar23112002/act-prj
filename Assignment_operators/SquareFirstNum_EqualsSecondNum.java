package com.Array.Assignment;

//Square of First Number equals to Second Number or Not 
public class SquareFirstNum_EqualsSecondNum {

	public static void main(String[] args) {

		boolean values = square(2, 4);
		System.out.println(values);

	}

	public static boolean square(int i, int j) {

		return i * i == j;
	}

}
