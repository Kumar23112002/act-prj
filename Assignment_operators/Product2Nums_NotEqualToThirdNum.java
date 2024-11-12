package com.Array.Assignment;

//Condition to check the multiplication of 2 numbers not equals to 3rd number or not
public class Product2Nums_NotEqualToThirdNum {

	public static void main(String[] args) {
		boolean values = num(2, 3, 7);
		System.out.println(values);

	}

	public static boolean num(int i, int j, int k) {

		return i * j != k;
	}

}
