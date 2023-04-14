package com.example.Arithmetic_try_catch;
//String NullException using try with multiple catch
public class TryCatchArithmeticDemo6 {

	public void display(String a, String b) {
		//NUll Check
//	if(a== null && b==null) {
			try {
			
				String c = a.concat(b);
				System.out.println("Division of a and b: "+c.charAt(5));
				//charAt use for to print the character
			}
			catch(ArithmeticException e ) {
				e.printStackTrace();
			}
			catch(NullPointerException e ) {
				e.printStackTrace();
			}
			catch(Exception e ) {
				System.out.println("Exception Occured"+e);
			}
		}
		/*else {
			System.out.println("Value of a: " + a + " Value of b: "+b);
		}
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryCatchArithmeticDemo6 demo = new TryCatchArithmeticDemo6();
		demo.display("","Mahajan");
	}

}
