package com.example.arithmetic_try_catchdemo;
//wrapper class with null check
public class TryCatchArithDemo {
	
	public void division(Integer a,Integer b) {
		if(a!=null && b!=null) {
			
			try {
				Integer c= a/b;
				System.out.println("The Division of :: "+c);
			} catch (ArithmeticException e) {
				e.printStackTrace();
			}
			catch (NullPointerException e) {
				e.printStackTrace();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}else {
			System.err.println("Null-Pointer Exception is Occured here ");
		}
	}
	
	public static void main(String[] args) {
		TryCatchArithDemo tryCatchArithDemo = new TryCatchArithDemo();
		tryCatchArithDemo.division(50, null);

	}

}
