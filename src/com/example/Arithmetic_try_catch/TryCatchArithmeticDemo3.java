package com.example.Arithmetic_try_catch;

// Try with multiple Catch Exception Handling
public class TryCatchArithmeticDemo3 {

	public void division() {
		//Declaring instance variables
		int a = 12;
		int b = 0;
		
		try {
			int c = a/b;
			System.out.println("Division of a and b: "+c);
		}
		
		catch(ArithmeticException e) {
			e.printStackTrace();
			}
		
		catch(Exception e) {
			e.printStackTrace();
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryCatchArithmeticDemo3 demo = new TryCatchArithmeticDemo3();
		demo.division();
	}

}
