package com.example.array_try_catch;

public class ArrayArithmeticCaseOne {
	private void arithmeticOperation(int[] intarray) {
		try {
			for (int i = 0; i < intarray.length; i++) {
				System.out.println(intarray[i]);
			}
			
			int b[] = intarray;
			try {
				for (int i = 0; i < b.length; i++) {
					int div = b[i]/0;
					System.out.println(div);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {1,2,3,4,5};
		ArrayArithmeticCaseOne CaseOne =new ArrayArithmeticCaseOne();
		CaseOne.arithmeticOperation(intArray);
	}

}
