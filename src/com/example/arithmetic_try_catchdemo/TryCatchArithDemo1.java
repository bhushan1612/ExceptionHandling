package com.example.arithmetic_try_catchdemo;

//Program with try catch
public class TryCatchArithDemo1 {

	public void division() {
		int a = 10;
		int b = 2;
		try {
			int c = a / b;
			System.out.println("The Division is :: " + c);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryCatchArithDemo1 tryCatchArithDemo1 = new TryCatchArithDemo1();
		tryCatchArithDemo1.division();
	}

}
