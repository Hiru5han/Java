package Vehicles;

public class Motorcycle extends Vehicle {

	private boolean feelThebreeze;
	private boolean sidecar;

	public Motorcycle(String model, String maker, String colour, String typeOfcar, int wheelNumber, double cost) {
		super(model, maker, colour, typeOfcar, wheelNumber, cost);
	}

	public boolean isFeelThebreeze() {
		return feelThebreeze;
	}

	public void setFeelThebreeze(boolean feelThebreeze) {
		this.feelThebreeze = feelThebreeze;
	}

	public boolean isSidecar() {
		return sidecar;
	}

	public void setSidecar(boolean sidecar) {
		this.sidecar = sidecar;
	}

}
