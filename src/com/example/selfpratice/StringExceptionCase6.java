package com.example.selfpratice;

//Program for converting String to Character Array by using charAt();
public class StringExceptionCase6 {

	public void display(String a, String b) {
		if (a != null && b != null) {

			try {
				System.out.println("Name : " + a + " " + b);
			} catch (Exception e) {
				e.printStackTrace();
			}
			for (int i = 0; i < a.length(); i++) {
				System.out.println(a.charAt(i));

			}
			for (int i = 0; i < b.length(); i++) {
				System.out.println(b.charAt(i));
			}
		}

		else {
			System.out.println("Exception is occured");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringExceptionCase6 Case6 = new StringExceptionCase6();
		String a=null;
		String b=null;
		Case6.display("Bhushan", "Mahajan");
	}

}
