package com.example.selfpratice;
//program of exception handling in main method
public class ArithmeticExceptionCase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a = 12;
		Integer b = null;
		if (a != null && b != null) {
			try {
				int c = a / b;
				System.out.println("The division :" + c);
			} catch (NullPointerException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println(" Do not accept Null Value......");
		}
	}
}
