package com.example.thorw_throws_finally;
//Simple Demo throws Exceptions
abstract class Demo {

	public void add(int a, int b) {
		int c = a + b;
		System.out.println("The Addition is :: " + c);
	}

	public abstract void division(int a, int b) throws Exception;
}

public class CaseDemo1 extends Demo
{
	
	public void division(int a,int b) {
		int c = a/b;
		System.out.println("The Division is :: "+c);
	}

	public static void main(String[] args) {
		CaseDemo1 caseDemo1 = new CaseDemo1();
		caseDemo1.add(20, 20);
		caseDemo1.division(20, 5);

	}

}
