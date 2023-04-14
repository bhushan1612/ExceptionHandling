package com.example.filestreamreader;

import java.io.File;
import java.util.Iterator;

public class IntAndCharConvert {

	 String intString = "";
	 String string="";

	public void convertIntAndCharConvert(String output) {

		
		try {
			
			String a = output;
			System.out.println("The Value of a :"+a);
			int i;
			for (i = 0; i < a.length(); i++) {
				char c = a.charAt(i);
				if ('0' <= c && c <= '9')
					intString = intString + c;
				if ('A' <= c && c <= 'Z')
					string = string + c;
				if ('a' <= c && c <= 'z')
					string = string + c;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(intString);
		System.out.println(string);
	}

	public static void main(String[] args) {
		FileInputStream1 fileInputStream1 = new FileInputStream1();
		IntAndCharConvert intAndCharConvert = new IntAndCharConvert();
		String fileName = "FileData.txt";
		File file = new File(fileName);
		fileInputStream1.inputStream(file);
		String output = fileInputStream1.outputString;
		intAndCharConvert.convertIntAndCharConvert(output);

	}

}
