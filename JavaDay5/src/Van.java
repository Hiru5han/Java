
public class Van implements Vehicle, Nitros {

	@Override
	public void wheels() {
		System.out.println("14 wheels");
	}

	@Override
	public void doors() {
		System.out.println("5 doors");
	}

	@Override
	public void colour() {
		System.out.println("White");
	}

	@Override
	public void transmission() {
		System.out.println("Automatic");
	}

	@Override
	public void NitrosActivate() {
		System.out.println("Van Nitros activated");
	}

}