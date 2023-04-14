package com.example.selfpratice;
import java.util.stream.Stream;

/*Convert Character to String */
public class ChartoString {
	
	public void charToStringConvert(char [] charArray) {
		
		if(charArray!=null) {
			for(char c:charArray) {
				System.out.println(c);
				
			}for(int i=0;i<charArray.length;i++) {
				System.out.println(charArray[i]);
				
			}
					
			
			String s1 = new String(charArray);
			System.out.println(s1);
			
			
		}else {
			System.out.println(charArray +"charArray It is Null");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char [] charArr = {'H','I'};
char [] charArray = new char[15];
charArray[0] = 'J';
charArray[1] = 'A';
charArray[2] = 'V';
charArray[3] = 'A';
charArray[4] = 'C';
charArray[5] = 'L';
charArray[6] = 'A';
charArray[7] = 'S';
charArray[8] = 'S';

ChartoString chartoString =new ChartoString();
//charArray=null;
chartoString.charToStringConvert(charArray);
	}

}
