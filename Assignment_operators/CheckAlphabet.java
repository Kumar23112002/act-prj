package com.Array.Assignment;

//Condition to check the character is Alphabet or not
public class CheckAlphabet {

	public static void main(String[] args) {

		boolean ch = alphabet('P');
		System.out.println(ch);

	}

	public static boolean alphabet(char ch) {

		return (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');
	}

}
