package com.example.livedailyprogram;

abstract class MathOperation{
	
	public void add(int a,int b) {
		int c = a+b;
		System.out.println("Tehe Addition is :: "+c);
	}
	//Declaration of abstract method
	public abstract void division(int x,int y)throws Exception;
}


 class Calculation extends MathOperation{

	 	//Implementation of abstract method in child class
		public void division(int x, int y) {
			try {
				int z = x/y;
				System.out.println("The Division is :: "+z);
				throw new ArithmeticException();
			}/* catch (ArithmeticException e) {
				e.printStackTrace();
			}*/
			finally {
				System.out.println("Any number is not able to divide/0");
			}
			
		}

	public static void main(String[] args) {
		Calculation calculation = new Calculation();
		calculation.add(20, 20);
		calculation.division(20, 0);
	}
}
