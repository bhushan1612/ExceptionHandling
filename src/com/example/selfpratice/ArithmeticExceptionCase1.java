package com.example.selfpratice;
//Normal program of exception handling
public class ArithmeticExceptionCase1 {

	public void division(int a, int b) {

		try {
			int c = a / b;
			System.out.println("The division :" + c);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithmeticExceptionCase1 arithmeticExceptionCase1 = new ArithmeticExceptionCase1();
		arithmeticExceptionCase1.division(10, 5);
	}

}
