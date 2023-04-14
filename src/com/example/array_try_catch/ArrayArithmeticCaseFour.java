package com.example.array_try_catch;

public class ArrayArithmeticCaseFour {
	private void arithmeticOperation(int[] intArray) {

		try {
			for (int i = 0; i < intArray.length; i++) {
				System.out.println(intArray[i]);
			}
			int[] b = intArray;
			b = null;
			try {
				for (int i = 0; i < 4; i++) {
					int div = b[i] / 0;
					System.out.println(div);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		int[] intArray = new int[4];
		intArray[0] = 1;
		intArray[1] = 2;
		intArray[2] = 3;
		intArray[3] = 4;

		ArrayArithmeticCaseFour CaseFour = new ArrayArithmeticCaseFour();
		CaseFour.arithmeticOperation(intArray);
	}

}
