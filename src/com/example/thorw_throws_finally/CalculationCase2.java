package com.example.thorw_throws_finally;

//Program of throws Arithmetic Exception using finally and without using catch
abstract class MathOperation2{
	
	public void add(int a,int b) {
		int c = a+b;
		System.out.println("The Addition is :: "+c);
	}
	
	public abstract void division(int a, int b) throws ArithmeticException;
}


public class CalculationCase2 extends MathOperation2{
	
	public void division(int a,int b) {
		
		try {
			int c = a/b;
			System.out.println("The Division is :: "+c);
		} finally {

			System.out.println("The Number is cannot divide by 0");
		}
	}
	
	public static void main(String[] args) {
		CalculationCase2 calculationCase2 =new CalculationCase2();
		calculationCase2.add(40, 30);
		calculationCase2.division(40, 0);
	}

}
