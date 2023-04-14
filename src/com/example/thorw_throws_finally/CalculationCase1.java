package com.example.thorw_throws_finally;
//Program of throws Exception using finally and without using catch
abstract class MathOperation1 {

	public void add(int a, int b) {
		int c = a + b;
		System.out.println("The Addition is :: " + c);
	}

	public abstract void division(int a, int b) throws Exception;
}

public class CalculationCase1 extends MathOperation1 {

	public void division(int a, int b) {
		try {
			int c = a / b;
			System.out.println("The Division is :: " + c);

		} finally {
			System.out.println("The Number is cannot divide by 0");
		}
	}

	public static void main(String[] args) {
		CalculationCase1 calculationCase1 = new CalculationCase1();
		calculationCase1.add(20, 20);
		calculationCase1.division(20, 0);//Arithmetic Exception Occured Here
		//calculationCase1.division(20, 2);
	}

}
