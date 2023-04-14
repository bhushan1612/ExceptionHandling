package com.example.arithmetic_try_catchdemo;
//Program of wrapper class  & parameterized varible ,handled exception by using multi-catch,Nullcheck
public class TryCatchArithDemo5 {

	public void division (Integer a,Integer b) {
	
		if(a!=null && b!=null) {
			try {
				b=null;
				Integer c = a/b;
				System.out.println("The Division is :: "+c);
			} catch (NullPointerException e) {
				e.printStackTrace();
			}catch (Exception e) {
				e.printStackTrace();
			}
			
		}else {
			System.out.println("Value of a :: "+a+ " Value of b :: "+b);
		}
	
	}
	
	
	public static void main(String[] args) {
		TryCatchArithDemo5 tryCatchArithDemo5 = new TryCatchArithDemo5();
		tryCatchArithDemo5.division(20, 4);

	}

}
