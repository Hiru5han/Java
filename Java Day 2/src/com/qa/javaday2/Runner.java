package com.qa.javaday2;

public class Runner {

	public static void main(String[] args) {
//		Calculator task
		System.out.println(Calculator.task1_add());
		System.out.println(Calculator.task1_multiplication());
		System.out.println(Calculator.task1_subtraction());
		Calculator.task1_division();
		
//		Coins task
		Coins.main(args);

//		Flowcharts
		Flowcharts.task1();
		
//		FlowChartsTwo
		FlowChartsTwo.step1();	

}
}
