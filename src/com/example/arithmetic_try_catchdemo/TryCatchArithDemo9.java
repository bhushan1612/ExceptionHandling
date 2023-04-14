package com.example.arithmetic_try_catchdemo;

public class TryCatchArithDemo9 {

	public void display(String a,String b) {
		if(a!=null && b!=null) {
			
		
		try {
			String s = a;
			System.out.println("Display :: "+s.charAt(0));
		}catch (NullPointerException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}else {
		System.out.println(" value of a :: "+a+" The value of a :: "+b);
	}
	}
	public static void main(String[] args) {
		TryCatchArithDemo9 tryCatchArithDemo9 = new TryCatchArithDemo9();
		tryCatchArithDemo9.display("Bhushan", null);

	}

}
