
public class results {

	public static void main(String[] args) {

		int phys = 150;
		int chem = 100;
		int bio = 150;
		System.out.println("Your Physics results: " + phys + " out of 150");
		System.out.println("Your Chemistry results: " + chem + " out of 150");
		System.out.println("Your Biology results: " + bio + " out of 150");

		System.out.println(percentage_grade(phys, chem, bio) + "%");

	}

	private static int percentage_grade(int a, int b, int c) {
		int percentage = ((a + b + c) * 100) / 450;
		return percentage;

	}

}
