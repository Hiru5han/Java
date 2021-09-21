package Vehicles;

public class Car extends Vehicle {

	private boolean familyComfort;
	private boolean softTop;

	public Car(String model, String maker, String colour, String typeOfcar, int wheelNumber, double cost, Boolean familyComfort) {
		super(model, maker, colour, typeOfcar, wheelNumber, cost);
	}

	public boolean isFamilyComfort() {
		return familyComfort;
	}

	public void setFamilyComfort(boolean familyComfort) {
		this.familyComfort = familyComfort;
	}

	public boolean isSoftTop() {
		return softTop;
	}

	public void setSoftTop(boolean softTop) {
		this.softTop = softTop;
	}

}
