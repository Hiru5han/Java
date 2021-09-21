package Interface;

public class Car implements Vehicle, Convertible {

	@Override
	public void wheels() {
		System.out.println("4 wheels");
	}

	@Override
	public void doors() {
		System.out.println("4 doors");
	}

	@Override
	public void colour() {
		System.out.println("Red");
	}

	@Override
	public void transmission() {
		System.out.println("Manual");
	}

	@Override
	public void RoofComesDown() {
		System.out.println("Roof opens");
	}

	@Override
	public void RoofGoesUp() {
		System.out.println("Roof closes");
	}

}