package com.example.arithmetic_try_catchdemo;
//Program of string index check by using chatAt(0);
public class TryCatchArithDemo7 {

	public void display(String a,String b) {
		if(a!=null && b!=null) {
			
			try {
				String s = a;
				b=null;
				System.out.println("String display as :: "+s.charAt(5));
			}catch (NullPointerException e) {
				e.printStackTrace();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			
		}else {
			System.out.println("Value of a :: "+a+"Value of b :: "+b);
		}
		
	}
	public static void main(String[] args) {
		TryCatchArithDemo7 tryCatchArithDemo7 = new TryCatchArithDemo7();
		tryCatchArithDemo7.display("Bhushan","Mahajan");

	}

}
