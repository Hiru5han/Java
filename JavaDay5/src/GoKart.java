
public class GoKart implements Vehicle, Nitros {

	@Override
	public void wheels() {
		System.out.println("2 wheels");
	}

	@Override
	public void doors() {
		System.out.println("No doors");
	}

	@Override
	public void colour() {
		System.out.println("Orange");
	}

	@Override
	public void transmission() {
		System.out.println("None, it's electric");
	}

	@Override
	public void NitrosActivate() {
		System.out.println("Woooooohooo!");
	}

}