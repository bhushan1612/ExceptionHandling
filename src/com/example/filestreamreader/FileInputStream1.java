package com.example.filestreamreader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream1 {

	String fileContent = "12 A 34 B 56 C 78  D 9  E 10 F 11 G 12 H 13 I 14 J 15 K 16 L 17 M 18 N 19 O 20 P ";

	String outputString = null; 
	String intString = "";
	String string = "";
	public void inputStream(File file) {
		FileInputStream inputStream = null;
		try {
		
		System.out.println("***************************************");
		inputStream =new FileInputStream(file);
		try {
		
			byte[] bytes = new byte[100];
			
			while(inputStream.read(bytes) != -1)
				outputString = new String (bytes);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Output String : "+outputString);
	
		System.out.println("Seperating Int Value and String Values from "+"combined "+ "String "+"\n"+ "String Values : "+fileContent);
		
		String a= outputString;
		int i;
		 for(i = 0; i < a.length(); i++){
             char c = a.charAt(i);
                if( '0' <= c && c <= '9' )
                 intString=intString+c;
                if( 'A' <= c && c <= 'Z' )
                 string=string+c;
                if( 'a' <= c && c <= 'z' )
                 string=string+c;
     }
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		FileInputStream1 fileInputStream1 = new FileInputStream1();
		String fileName = "FileData.txt";
		File file = new File(fileName);
		fileInputStream1.inputStream(file);
		
		
	}

}
