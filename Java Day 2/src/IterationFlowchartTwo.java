
public class IterationFlowchartTwo {

	public static void main(String[] args) {
		for (int a = 100; a <= 200; a++) {
			if (a % 2 == 0) {
				System.out.println("-");
			} else {
				System.out.println("*");

			}

			task_three();
			task_five();
		}

	}

	private static void task_five() {
		for (int i = 1; i <= 10; i++) {
			int count = 0;
			while (count < i) {
				System.out.println(i);
				count++;
			}
		}
	}

	private static void task_three() {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(j);
			}
		}

	}
}
