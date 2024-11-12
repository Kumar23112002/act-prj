package com.method.ex;

public class FirstMethod {

	public static void main(String[] args) {

		System.out.println("This is main method executed by internal translator");
		run();// method calling statement
		Name();
	}

	public static void run() {
		System.out.println("This is run method defined by the developer");
	}

	public static void Name() {
		System.out.println("enter the name");
	}

}
