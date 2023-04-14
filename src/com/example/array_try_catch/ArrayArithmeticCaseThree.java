package com.example.array_try_catch;

import java.util.Iterator;

public class ArrayArithmeticCaseThree {
	private void arithmeticOperation(int[] intArray) {
		try {
			for (int i = 0; i < intArray.length; i++) {
				System.out.println(intArray[i]);
			}
			try {
				int b[]=intArray;
				System.out.println("****Addition****");
				for (int i = 0; i < 4; i++) {
					
					int c=b[i]+2;
					System.out.println(c);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
	
		int[] intArray=new int[6];
		intArray[0]=1;
		intArray[1]=2;
		intArray[2]=3;
		intArray[3]=4;
		intArray[3]=40;
		
		ArrayArithmeticCaseThree CaseThree= new ArrayArithmeticCaseThree();
		CaseThree.arithmeticOperation(intArray);
		
	}

}
