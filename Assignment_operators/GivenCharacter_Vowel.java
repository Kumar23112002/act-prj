package com.Array.Assignment;

//Condition to check the character is Vowel or Not
public class GivenCharacter_Vowel {

	public static void main(String[] args) {
		boolean ch = vowel('a');
		System.out.println(ch);

	}

	private static boolean vowel(char ch) {

		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	}

}
