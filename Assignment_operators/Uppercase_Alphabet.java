package com.Array.Assignment;

//Condition to check the character is Upper case alphabet or not
public class Uppercase_Alphabet {

	public static void main(String[] args) {

		boolean ch = alphabet('A');
		System.out.println(ch);

	}

	public static boolean alphabet(char ch) {

		return ch >= 'A' && ch <= 'Z';
	}

}
