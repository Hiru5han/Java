package com.qa.javaday3;

public class Arrays {

	public static void main(String[] args) {
		agearray();
	}

	public static void agearray() {

		int[] ageArraySD = new int[10];
		ageArraySD[0] = 45;
		ageArraySD[4] = 35;
		ageArraySD[2] = 43;
		ageArraySD[3] = 83;
		ageArraySD[1] = 67;
		ageArraySD[5] = 22;
		ageArraySD[6] = 68;
		ageArraySD[7] = 41;
		ageArraySD[8] = 21;
		ageArraySD[9] = 82;
			
		for(int age:ageArraySD)	{
				System.out.print(age + " ");
			}
		//System.out.println();
	}

}
