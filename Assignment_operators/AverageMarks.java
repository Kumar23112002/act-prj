package com.Array.Assignment;

//Condition to check average of 4 subjects marks greater than 60 or not
public class AverageMarks {

	public static void main(String[] args) {
		int values = average(2, 8, 6, 8);
		System.out.println(values);

	}

	public static int average(int i, int j, int k, int l) {
		return (i + j + k + l) / 4;
	}

}
