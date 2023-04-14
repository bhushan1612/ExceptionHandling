package com.example.Arithmetic_try_catch;
//Exception Handling With Try and Catch 
public class TryCatchArithmeticDemo2 {

	public void division() {
		//Declaring instance variables
		int a = 12;
		int b = 0;
		
		try {
			int c = a/b;
			System.out.println("Division of a and b: "+c);
		}
		
		catch(ArithmeticException e) {
			System.out.println("Exception : "+e);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryCatchArithmeticDemo2 demo = new TryCatchArithmeticDemo2();
		demo.division();
	}

}
