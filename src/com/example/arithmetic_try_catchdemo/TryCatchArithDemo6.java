package com.example.arithmetic_try_catchdemo;

//Handling Null-Check exception by using try with mulitple catch without if condition 
public class TryCatchArithDemo6 {

	public void division(Integer a, Integer b) {

		try {
			Integer c = a / b;
			System.out.println("The Division :: " + c);
		} catch (NullPointerException e) {
			System.err.println("NullPointer Exception"+e);
			//e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		TryCatchArithDemo6 tryCatchArithDemo6 = new TryCatchArithDemo6();
		tryCatchArithDemo6.division(20, null);
	}

}
