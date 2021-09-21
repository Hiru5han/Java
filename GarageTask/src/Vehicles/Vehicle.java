package Vehicles;

public abstract class Vehicle {

	private String typeOfcar;
	private String maker;
	private String colour;
	private int wheelNumber;
	private double cost;
	private String model;
	
	public Vehicle (String model, String maker, String colour, String typeOfcar, int wheelNumber, double cost) {
		this.model = model;
		this.typeOfcar = typeOfcar;
		this.colour = colour;
		this.wheelNumber = wheelNumber;
		this.cost = cost;
		this.maker = maker;	
	}

	public String getTypeOfcar() {
		return typeOfcar;
	}

	public void setTypeOfcar(String typeOfcar) {
		this.typeOfcar = typeOfcar;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getWheelNumber() {
		return wheelNumber;
	}

	public void setWheelNumber(int wheelNumber) {
		this.wheelNumber = wheelNumber;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	

}
