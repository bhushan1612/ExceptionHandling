package com.example.string_to_int_and_char;

public class StringToIntCharArrayCase4 {

	int[] arr;
	public int[] getArray() {
		return arr;
	}
	public int[] setArray(int[] a){
		return this.arr = a;
	}
	public void stringToIntConvert(String arra) {
		String s = arra;
		//System.out.println("String :: "+ s +"\n");
		try {
			int [] arrays = convertStringToInt(s);
			setArray(arrays);
			for (int i = 0; i < arrays.length; i++) {
				//System.out.println("Integer Array :: "+arrays[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			char [] array = new char[s.length()];
			for (int i = 0; i < s.length(); i++) {
				array[i]=s.charAt(i);
				
			}
			for (int i = 0; i < array.length; i++) {
				//System.out.println("Char Array :: "+array[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private int[] convertStringToInt(String s) {
		char [] charr = s.toCharArray();
		int [] num = new int [charr.length];
		for (int i = 0; i < charr.length; i++) {
			num[i] = charr[i]-'0';
		}
		return num;
	}
	
	/*public static void main(String[] args) {
		StringToIntCharArrayCase4 stringToIntCharArrayCase4 = new StringToIntCharArrayCase4();
		String str="9767277013";
		
		if(str!= null) {
			stringToIntCharArrayCase4.stringToIntConvert(str);
		}else {
			System.err.println("String is null :: "+str);
		}
	}*/
}
