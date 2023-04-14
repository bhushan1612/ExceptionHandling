package com.example.selfpratice;
//Null check with wrapper class
public class ArithmeticExceptionCase2 {

	public void division(int a, Integer b) {
		if (b!= null) {
			try {
				int c = a / b;
				System.out.println("The division : " + c);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println(" Do not accept Null Value......");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithmeticExceptionCase2 arithmeticExceptionCase2 = new ArithmeticExceptionCase2();
		arithmeticExceptionCase2.division(10, 2);
	}

}
