package com.Array.Assignment;

public class MorningRoutine {

	public static void main(String[] args) {

		wakeUp();

	}

	public static void wakeUp() {
		System.out.println("Wake up at @5:00 AM refresh yourself");
		activate();
	}

	public static void activate() {
		System.out.println("Meditate for 10mins");
		System.out.println("Do yoga poses");
		energize();

	}

	public static void energize() {
		System.out.println("Have some food and get ready to class");

	}

}
