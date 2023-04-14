package com.example.selfpratice;

import java.util.Iterator;
//Program for converting from String to Integer Array by using valueOf(a.charAt(i));
public class StringExceptionCase7 {

	public void display(String a, String b) {
		if (a != null && b != null) {

			try {
				System.out.println("Name :: " + a + " " + b);

				char[] c = a.toCharArray();

				int[] nums = new int[c.length];

				for (int i = 0; i < c.length; i++) {
					// System.out.println(c[i]);
					nums[i] = c[i] - '0';
					System.out.println(nums[i]);
				}
				
				int [] num = new int [c.length];
				for (int i = 0; i < a.length(); i++) {
					
					num[i]=Integer.valueOf(a.charAt(i)-'0');
				}
				
				for (int i = 0; i < num.length; i++) {
					System.out.println("Integer Array :: "+num[i]);
				}

			} catch (NullPointerException e) {
				// TODO: handle exception
				e.printStackTrace();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringExceptionCase7 case7 = new StringExceptionCase7();
		case7.display("123456", "Core-Java");

	}

}
