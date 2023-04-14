package com.example.arithmetic_try_catchdemo;
//Program try with multi catch
public class TryCatchArithDemo3 {
	
	public void division() {
		int a=10;
		int b=0;
		
		try {
			int c = a/b;
			System.out.println("The Division is :: "+c);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception Occured :: "+e);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryCatchArithDemo3 tryCatchArithDemo3 = new TryCatchArithDemo3();
		tryCatchArithDemo3.division();
	}

}
