package Interface;

public class Bicycle implements Vehicle, EnvironmentallyCounciousGoodFeeling {

	@Override
	public void GoodFeeling() {
		System.out.println("Feeling: Great!");
	}

	@Override
	public void SoreLegs() {
		System.out.println("Also Feeling: Sore");
	}

	@Override
	public void wheels() {
		System.out.println("2");
	}

	@Override
	public void doors() {
		System.out.println("No doors");
	}

	@Override
	public void colour() {
		System.out.println("purple");
	}

	@Override
	public void transmission() {
		System.out.println("The most manual transmission ever made");
	}

}
