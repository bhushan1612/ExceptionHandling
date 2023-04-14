package com.example.arithmetic_try_catchdemo;

public class TryCatchArithDemo8 {

	public void display() {
		String a="Sun-Certified SCJP";
		try {
			System.out.println("The Length of String is :: "+a.length());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		TryCatchArithDemo8 tryCatchArithDemo8 = new TryCatchArithDemo8();
		tryCatchArithDemo8.display();

	}

}
