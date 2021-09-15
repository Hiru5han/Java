
public class FlowChartsTwo {

	public static void main(String[] args) {
		step1();
	}

	private static void step1() {
		int a = 500;

		if (a > 2000) {
			System.out.println("A");
		}
		if (a > 2000 & a > 6000) {
			System.out.println("C");
		}
		if (a > 2000 & a < 6000) {
			System.out.println("B");
		}
		if (a > 2000 & a < 6000 & a > 4000) {
			System.out.println("D");
		}
		if (a > 2000 & a < 6000 & a < 4000) {
			System.out.println("E");
		}
		if (a < 2000) {
			System.out.println("1");
		}
		if (a < 2000 & a > 100) {
			System.out.println("3");
		}
		if (a < 2000 & a < 100) {
			System.out.println("2");
		}
		if (a < 2000 & a > 100 & a > 600) {
			System.out.println("5");
		}
		if (a < 2000 & a > 100 & a < 600) {
			System.out.println("4");
		}
		if (a < 2000 & a > 100 & a < 600 & a > 500) {
			System.out.println("6");
		}
		if (a < 2000 & a > 100 & a < 600 & a < 500) {
			System.out.println("7");
		}
	}
}
