package com.example.array_try_catch;
/*try inside try
 arrayIndexOutOfBound
 Arithmetic
 NullPointer Exception*/
public class ArrayArithmeticCaseTwo {

	private void arithmeticOperation(int[] intArray) {
		try {
			for (int i = 0; i < 6; i++) {
				System.out.println(intArray[i]);
			}
			int[] b = intArray;
			//b=null;
			try {
				for (int i = 0; i < b.length; i++) {
					int div = b[i]/2;
					System.out.println(b[i]);
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		catch (NullPointerException e) {
			e.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		int[] intArray = {1,2,3,4,5};
		ArrayArithmeticCaseTwo caseTwo =new ArrayArithmeticCaseTwo();
		caseTwo.arithmeticOperation(intArray);

	}

}
