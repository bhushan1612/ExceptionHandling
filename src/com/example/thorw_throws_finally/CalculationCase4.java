package com.example.thorw_throws_finally;

abstract class MathOperation4{
	
	public void add(int a,int b) {
		int c = a+b;
		System.out.println("The Addition is :: "+c);
	}
	
	public abstract void division(int a,int b) throws Exception;
}

public class CalculationCase4 extends MathOperation4{

	@Override
	public void division(int a, int b) {
		try {
			int c = a/b;
			System.out.println("The division is :: "+c);
			throw new ArithmeticException();
		}finally {
			System.out.println("The Number is cannot divide by 0");
		}
	}
	
	public static void main(String[] args) {
		CalculationCase4 calculationCase4 = new CalculationCase4();
		calculationCase4.add(25,25);
		calculationCase4.division(40, 0);
	}


}
