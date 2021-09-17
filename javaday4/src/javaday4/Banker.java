package javaday4;

public class Banker extends EndOfDayTaskPerson {

	public Banker(String job, long salary, boolean offShoreAccount) {
		this.job = job;
		this.salary = salary;
		OffShoreAccount = offShoreAccount;

	}

	String job;
	long salary;
	boolean OffShoreAccount = true;

//	@Overriding the eat function
	public void eat() {
		System.out.println("I'll have the lobster, dear sir");
	}

}
