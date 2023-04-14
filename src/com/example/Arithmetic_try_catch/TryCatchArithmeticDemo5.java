package com.example.Arithmetic_try_catch;
//Try with multiple Catch With using if else condition Null Check Exception Handling
public class TryCatchArithmeticDemo5 {

	public void division(Integer a,Integer b) {
		//NUll Check
		if(a!= null && b!=null) {
			try {
				Integer c = a/b;
				System.out.println("Division of a and b: "+c);
			}
			catch(ArithmeticException e ) {
				e.printStackTrace();
			}
			catch(NullPointerException e ) {
				e.printStackTrace();
			}
			catch(Exception e ) {
				System.out.println("Exception Occured"+e);
			}
		}
		else {
			System.out.println("Value of a: " + a + " Value of b: "+b);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryCatchArithmeticDemo5 demo = new TryCatchArithmeticDemo5();
		demo.division(12,null);
	}

}
