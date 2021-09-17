package javaday4_encapsulation_package;

public class Runner {

	public static void main(String[] args) {
	Encapsulation x = new Encapsulation();
	
	x.setName("Hiru");
	x.setAge(456);
	x.setHeight(7945.12);
	x.setCrazysmallnumber(0.23f);
	x.setCrazybignumber(78464687);
	
	x.getName();
	x.getAge();
	x.getHeight();
	x.getCrazysmallnumber();
	x.getCrazybignumber();
}
}