package com.example.thorw_throws_finally;
//Simple Demo throws Arithmetic Exceptions
abstract class Test2{

	public void add(int a, int b) {
		int c = a + b;
		System.out.println("The Addition is :: " + c);
	}

	public abstract void division(int a, int b) throws ArithmeticException;
}

public class CaseDemo2 extends Test2{
	
	public void division(int a,int b) {
		int c = a/b;
		System.out.println("The Division is :: "+c);
	}

	public static void main(String[] args) {
		CaseDemo2 caseDemo2 = new CaseDemo2();
		caseDemo2.add(20, 20);
		caseDemo2.division(20, 5);

	}

}
