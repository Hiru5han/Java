package com.qa.javaday3;

public class StringManipulationTaskOne {

	public static void main(String[] args) {

		String string_one = "yesterday it was raining";
		String string_two = "today it is sunny";

		System.out.println(string_one.toUpperCase() + ", " + string_two.toUpperCase());
		System.out.println((string_two.substring(0, 12)).toUpperCase() + (string_one.substring(17, 24).toUpperCase()));
		
		
//		for (int letter = 0; letter < string_one.length(); letter++) {
	//System.out.println((string_one.contentEquals(" ").count));
}
}
