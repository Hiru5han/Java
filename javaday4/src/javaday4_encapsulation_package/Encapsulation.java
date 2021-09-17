package javaday4_encapsulation_package;

public class Encapsulation {

	private String name;
	private int age;
	private double height;
	private float crazysmallnumber;
	private long crazybignumber;

	public Encapsulation(String name, int age, double height, float crazysmallnumber, long crazybignumber) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.crazysmallnumber = crazysmallnumber;
		this.crazybignumber = crazybignumber;
	}

	public Encapsulation() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public float getCrazysmallnumber() {
		return crazysmallnumber;
	}

	public void setCrazysmallnumber(float crazysmallnumber) {
		this.crazysmallnumber = crazysmallnumber;
	}

	public long getCrazybignumber() {
		return crazybignumber;
	}

	public void setCrazybignumber(long crazybignumber) {
		this.crazybignumber = crazybignumber;
	}

}
