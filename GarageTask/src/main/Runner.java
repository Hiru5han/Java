package main;

import java.util.Scanner;

import Garage.Garage;
import Vehicles.Car;
import Vehicles.Vehicle;

public class Runner {

	public static void main(String[] args) {

		Car car = new Car(null, null, null, null, 0, 0, true);

		Scanner myObj = new Scanner(System.in);
		System.out.println("Is it comfortable for a family? Y/N");
		if (myObj.nextLine() == "Y") {
			car.setFamilyComfort(true);
		}
		
		System.out.println(car.isFamilyComfort());
	}
		public void printAll() {
			Vehicle.forEach(System.out::println);
		}
	{

//		Car car = new Car("Yaris", "Toyota", "Burgandy", "Small", 4, 5000, true);
//		car.setFamilyComfort(true);
//		
//		System.out.println("is it comfortable for a family?");
//			if 

	}
}
