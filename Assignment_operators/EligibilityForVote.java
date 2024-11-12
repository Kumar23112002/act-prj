package com.Array.Assignment;

//Condition to person is eligible for Vote or Not
public class EligibilityForVote {

	public static void main(String[] args) {
		boolean vote = age(19);
		System.out.println(vote);

	}

	public static boolean age(int i) {

		return i >= 18;
	}

}
