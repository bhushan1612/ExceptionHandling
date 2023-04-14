package com.example.arithmetic_try_catchdemo;
//Program for wrapper class and global varibale using handled multiple catch Exception 
public class TryCatchArithDemo4 {
	Integer a=10;
	Integer b=null;
	public void division() {
		
		try {
			Integer c= a/b;
			System.out.println("The Division :: "+c);
		} catch(NullPointerException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		TryCatchArithDemo4 tryCatchArithDemo4 = new TryCatchArithDemo4();
		tryCatchArithDemo4.division();

	}

}
