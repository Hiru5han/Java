
public class DataTypeExcersise {

	public static void main(String[] args) {

		int x = 5;
		double y = 3.21d;
		String teststring = "test";

		System.out.println(
				"First  variable: " + (x) + ", Second  variable " + (y) + ", And last but not lease: " + (teststring));
		System.out.println(ReturnMethod());
	}

	public static String ReturnMethod() {

		String s = "Hello World";
		return s;
	}

}