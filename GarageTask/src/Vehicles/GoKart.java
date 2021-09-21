package Vehicles;

public class GoKart extends Vehicle {

	private boolean isFun;
	private boolean nitros;

	public GoKart(String model, String maker, String colour, String typeOfcar, int wheelNumber, double cost) {
		super(model, maker, colour, typeOfcar, wheelNumber, cost);
	}

	public boolean isFun() {
		return isFun;
	}

	public void setFun(boolean isFun) {
		this.isFun = isFun;
	}

	public boolean isNitros() {
		return nitros;
	}

	public void setNitros(boolean nitros) {
		this.nitros = nitros;
	}

}
