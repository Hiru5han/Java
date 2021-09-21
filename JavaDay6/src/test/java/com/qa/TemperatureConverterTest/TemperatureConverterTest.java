package com.qa.TemperatureConverterTest;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class TemperatureConverterTest {

	@BeforeClass
	private static void message() {
		System.out.println("A message before the tests");
	}
	
	@Test
	public void convertFahrenheitToCelsiusTest() {
		System.out.println((5/9) * (100 - 32));
		assertEquals ("Expected: 37.78", );
	}
	@Test
	public float convertCelsiusToFahrenheit(int celsius) {
		return ((float) 9 / 5) * (celsius) + 32;
	}

	@Test
	public float convertKelvinToCelsius(int kelvin) {
		return (kelvin - 273);
	}

	@Test
	public float convertCelsiusToKelvin(int celsius) {
		return (celsius + 273);
	}

	@Test
	public float convertKelvinToFahrenheit(int kelvin) {
		return ((float) 9 / 5) * (kelvin - 273) + 32;
	}

	@Test
	public float convertFahrenheitToKelvin(int fahrenheit) {
		return ((float) 5 / 9) * (fahrenheit - 32) + 273;
	}

}
