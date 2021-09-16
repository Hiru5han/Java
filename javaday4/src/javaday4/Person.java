package javaday4;

public class Person {

//	1)Create a Person class with a few variables (height, name, shoe size, job title, age).

	private int height;
	private String name;
	private double shoesize;
	private String jobtitle;
	private int age; 
	
//	2) Generate a constructor with all of them.

	public Person(int height, String name, double shoesize, String jobtitle, int age) {
		this.height = height;
		this.name = name;
		this.shoesize = shoesize;
		this.jobtitle = jobtitle;
		this.age = age;
	}
	
//	3) Create another constructor that only has name and height.

	public Person(int height, String name) {
		this.height = height;
		this.name = name;
	}
		
//	4) Create 2 methods that use these variable (e.g. greet - similar to the one I showed you). They SHOULD NOT be static.
		
	public void greet()	{
		System.out.println("Hello " + name);		
	}
	public void age_gate()	{
		if(age < 18);
			System.out.println("YOU SHALL NOT PASS!");
		} else {
			System.out.println("YOU SHALL PASS!");
		}
		
		
		
		
//		5) Create 4 instances of the Person class in your runner and call the methods.
		
//		6) Upload your code to GitHub. 

	
	}
