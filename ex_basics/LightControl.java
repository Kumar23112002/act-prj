package com.method.ex;

//Simulating a simple on/off control for a light.

public class LightControl {

	private static boolean isOn = false;

	public static void toggleLight() {
		isOn = !isOn;
		if (isOn) {
			System.out.println("Light is ON.");
		} else {
			System.out.println("Light is OFF.");
		}
	}

	public static void main(String[] args) {
		toggleLight();// Light is ON.
		toggleLight();// Light is OFF.

	}

}
