package com.Array.Assignment;

//Condition to check the given quantity of fruits exactly in dozens or not
public class FruitsDozen {

	public static void main(String[] args) {

		boolean fruits = num(17);
		System.out.println(fruits);

	}

	public static boolean num(int fruits) {

		return fruits % 12 == 0;
	}

}
