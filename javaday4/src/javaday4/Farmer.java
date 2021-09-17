package javaday4;

public class Farmer extends EndOfDayTaskPerson {

	public Farmer(String job, long salary, boolean offShoreAccount) {
		this.job = job;
		this.salary = salary;
		OffShoreAccount = offShoreAccount;
	}

	String job;
	long salary;
	boolean OffShoreAccount = false;

	private static void CleanPigShit() {
		System.out.println("Nothing like the smell of pig shit in the morning!");
	}

//		@Overriding the eat function
	public void eat() {
		System.out.println("Fresh lamb again, woo!");

	}

}
