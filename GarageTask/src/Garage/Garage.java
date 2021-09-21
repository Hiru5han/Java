package Garage;

import java.util.ArrayList;

import Vehicles.Vehicle;

public class Garage {

	private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

	public void addVehicle(Vehicle x) {
		this.vehicles.add(x);
	}

	public void removeVehicle(Vehicle v) {

		if (this.vehicles.remove(v)) {
			System.out.println("Removed for yah!");
		} else {
			System.out.println("Whatchu talkin bout fool?");
		}

	}

	public void removeVehiclesByType(String typeOfcar) {
		ArrayList<Vehicle> found = new ArrayList<Vehicle>();
		for (Vehicle vehicle : vehicles) {
			if (vehicle.getTypeOfcar() == typeOfcar) {
				found.remove(vehicle);
			}
		}

	}

	public void workOutbills(String typeOfcar) {

		int bp = 500;
		
		for (Vehicle vehicle : vehicles)
			
		if (vehicle.getTypeOfcar() == "Car") {
			int bill = bp * 2;
			System.out.println("The bill for your Car: is £" + bill);
			} else if (vehicle.getTypeOfcar() == "Van") {
				int bill = bp * 3;
				System.out.println("The bill for your Van: is £" + bill);
			} else if (vehicle.getTypeOfcar() == "Motorcycle") {
				int bill = bp * 4;
				System.out.println("The bill for your Motorcycle: is £" + bill);
			} else if (vehicle.getTypeOfcar() == "Go Kart") {
				int bill = bp * 45;
				System.out.println("This is gonna be one helluva bill for you Go Kart: £" + bill);
			}
		}
	}

