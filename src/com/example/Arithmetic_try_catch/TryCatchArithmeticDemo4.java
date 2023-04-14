package com.example.Arithmetic_try_catch;
/* wrapper class and  instance variable using multiple catch exception without using if else
 *  condition using null check*/
public class TryCatchArithmeticDemo4 {

	public void division() {
		//Wrapper class
	Integer a = 10;
	Integer b = 0;
	
	try{
		//null value assign to wrapper class
		a= null;
		
		Integer c = a/b;
		System.out.println("Division of a and b: "+c);
	}
	catch(ArithmeticException e) {
		e.printStackTrace();
		}
	catch(NullPointerException e) {
		e.printStackTrace();
		}
	catch(Exception e) {
		System.out.println("Exception Occured: "+e);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryCatchArithmeticDemo4 demo = new TryCatchArithmeticDemo4();
		demo.division();
	}

}
