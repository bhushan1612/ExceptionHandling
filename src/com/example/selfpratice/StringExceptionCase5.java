package com.example.selfpratice;
//String To and charArray[] to  intArray[]; 
public class StringExceptionCase5 {

	public void display(String a, String b) {
	 
		if (a != null && b != null) {
			try {
				System.out.println("Name : " + a + " " + b);
				System.out.println(" \n ");
								
				//String convert Character Array
				char [] c = a.toCharArray();//string convert to char[]
				
				int[] num1=new int[c.length];
				//2nd way to store the char[] to int[]
				for (int i = 0; i < c.length; i++) {
					//System.out.println("Output :: "+c[i]);
					num1[i]=c[i]-'0';
					System.out.println("Answer :: "+num1[i]);
				}
				System.out.println("\n");
					
				//convert string to Int [] 
				int [] num =new int [c.length];
					for(int i=0;i<a.length();i++) {
						num[i]=Integer.valueOf(a.charAt(i)-'0'); 
						
					System.out.println("String to Int[] :: "+a.charAt(i));
					
				}
					System.out.println(" \n ");
					
					for (int i = 0; i < num.length; i++) {
						System.out.println("Integer[] Array : "+num[i]);
					}
				
			} catch (NullPointerException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		else {
			System.out.println("Null-Pointer Exception is occured");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringExceptionCase5 Case5 = new StringExceptionCase5();
		Case5.display("123456", "Mahajan");

	}

}
