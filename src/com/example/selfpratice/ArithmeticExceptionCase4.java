package com.example.selfpratice;

public class ArithmeticExceptionCase4 {
	
	public void division(Integer a,Integer b) {
		if (a!=null  &&b!=null) {

		try {
		int c = a / b;
		System.out.println("Division is : " +c);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		catch(NullPointerException e) {
			e.printStackTrace();
		}
	}
		else {
			System.out.println("Do not accept Null Value......");
		}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithmeticExceptionCase4 case4 = new ArithmeticExceptionCase4();
		case4.division(20, 0 );
	}

}
