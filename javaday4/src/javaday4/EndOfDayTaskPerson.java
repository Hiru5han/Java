package javaday4;

public class EndOfDayTaskPerson {

//  Exercise:
//    - Design a class named Person and two subclasses named Banker and Farmer.
//    - Every person should have some generic attributes (e.g. name, age) and functionality (e.g. eat, sleep).
//    - The Banker and Farmer subclasses should also have attributes and functionality unique to them.
//    - The two subclasses should have their own custom constructors to set any relevant values.
//    - The two subclasses should also override a method from the Person class and implement it differently.
//    - All three classes should override the toString() method in order to print some useful information about the class.
//    - The Subclass toString() methods should include the same information as Person, but with their own unqiue info on top.
//    - Use encapsulation - private class variables with getters & setters.
//    - Use a separate runner class with a main method.

	public static void main(String[] args) {

		class Person {

			private int height;
			private String name;
			private double shoesize;
			private int age;

			private void eat() {
				System.out.println("nom nom nom");
			}

			private void sleep()

			{
				System.out.println("ZzzzzzzZzzzzzz");
			}

			public int getHeight() {
				return height;
			}

			public void setHeight(int height) {
				this.height = height;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public double getShoesize() {
				return shoesize;
			}

			public void setShoesize(double shoesize) {
				this.shoesize = shoesize;
			}

			public int getAge() {
				return age;
			}

			public void setAge(int age) {
				this.age = age;
			}

		}

	}
}
