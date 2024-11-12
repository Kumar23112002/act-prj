package com.method.ex;

public class CheckGlobal {

	private static int num = 9;// Global Variable
	private static String name = "Praveen";
	private static char ch = 'P';

	public static void main(String[] args) {

		System.out.println(num);
		System.out.println(name);
		System.out.println(ch);
		call();
		int localNum = 3;// Local Variable
		System.out.println(localNum);

	}

	public static void call() {
		System.out.println(num);
		System.out.println(name);
		System.out.println(ch);
	}

}
