package com.example.thorw_throws_finally;

import java.io.File;

//Program of throw Arithmetic Exception using finally and without using catch

abstract class MathOperation3{
	
	public void add(int a,int b) {
		int c = a+b;
		System.out.println("The Addition is ::"+c);
	}
	public abstract void division(int a,int b) throws ArithmeticException;
}

public class CalculationCase3 extends MathOperation3{

	@Override
	public void division(int a, int b) {
		
		try {
			String fileName = "Addition.txt";
			File file=new File(fileName);
			
			file.createNewFile();
			
			try {
				int c=a/b;
				System.out.println("The division is :: "+c);
				throw new Exception();//exception occured here for that we need to use catch block
			} catch (Exception e) {
				e.printStackTrace();
			} finally {

				System.out.println("The Number is cannot divide by 0");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	public static void main(String[] args) {
		CalculationCase3 calculationCase3 = new CalculationCase3();
		calculationCase3.add(50, 50);
		calculationCase3.division(40, 0);
	}

}
