
public class calculator {

	public static double x = 10;
	public static double y = 5;

	public static void main(String[] args) {
		System.out.println(task1_add());
		System.out.println(task1_multiplication());
		System.out.println(task1_subtraction());
		task1_division();
	}

	private static double task1_add() {
		return x + y;
	}

	private static double task1_multiplication() {
		return x * y;
	}

	private static double task1_subtraction() {
		return x - y;
	}

	private static void task1_division() {
		if (x > y) {
			System.out.println("Division cannot be performed");
		} else {
			System.out.println(x / y);
		}

	}
}