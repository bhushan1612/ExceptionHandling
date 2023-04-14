package com.example.arithmetic_try_catchdemo;
//Program try with Arithmetic exception
public class TryCatchArithDemo2 {
	
	public void division() {
		int a= 100;
		int b= 0;
		
		try {
			int c = a/b;
			System.out.println("The Division :: "+c);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		TryCatchArithDemo2 tryCatchArithDemo2 = new TryCatchArithDemo2();
		tryCatchArithDemo2.division();

	}

}
