package Vehicles;

public class Van extends Vehicle {

	private int storageSpace;
	private boolean goodViewforTraffic;

	public Van(String model, String maker, String colour, String typeOfcar, int wheelNumber, double cost) {
		super(model, maker, colour, typeOfcar, wheelNumber, cost);
	}

	public int getStorageSpace() {
		return storageSpace;
	}

	public void setStorageSpace(int storageSpace) {
		this.storageSpace = storageSpace;
	}

	public boolean isGoodViewforTraffic() {
		return goodViewforTraffic;
	}

	public void setGoodViewforTraffic(boolean goodViewforTraffic) {
		this.goodViewforTraffic = goodViewforTraffic;
	}

}
