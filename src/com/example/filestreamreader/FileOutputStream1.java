package com.example.filestreamreader;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream1 {
	String intString;
	String string;
	public void outputStream1(String intString, String string) {
		FileOutputStream outputStream = null;
try {
	
			outputStream = new FileOutputStream("newFile.txt");
			
			try {
				outputStream.write(intString.getBytes());
				outputStream.write(string.getBytes());
			}catch (Exception e) {
				
				e.printStackTrace();
			}
			
			System.out.println("Content writen is done");
			System.out.println(intString);
			   System.out.println(string);
		}catch (IOException e) {

			e.printStackTrace();
			
		}finally {
			try {
				
				outputStream.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
			try {
				outputStream.flush();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		
	}
	

	public static void main(String[] args) {
		FileInputStream1 fileInputStream1 =new FileInputStream1();
		IntAndCharConvert intAndCharConvert =new IntAndCharConvert();
		String fileName = "Data.txt";
		File file =new File(fileName);
		fileInputStream1.inputStream(file);
		String output =fileInputStream1.outputString;
		intAndCharConvert.convertIntAndCharConvert(output);
	

		
		FileOutputStream1 fileOutputStream1 = new FileOutputStream1();
		String intString = intAndCharConvert.intString;
		String string = intAndCharConvert.string;
	
		fileOutputStream1.outputStream1(intString,string);
	}

}
