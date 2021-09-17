package com.qa.javaday2;

public class Calculator {

	public static double x = 25;
	public static double y = 200;

	public static void main(String[] args) {
		System.out.println(task1_add());
		System.out.println(task1_multiplication());
		System.out.println(task1_subtraction());
		task1_division();
	}

	static double task1_add() {
		return x + y;
	}

	static double task1_multiplication() {
		return x * y;
	}

	static double task1_subtraction() {
		return x - y;
	}

	static void task1_division() {
		if (x > y) {
			System.out.println("Division cannot be performed");
		} else {
			System.out.println(x / y);
		}

	}
}
