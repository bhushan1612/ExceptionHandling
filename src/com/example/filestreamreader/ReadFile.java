package com.example.filestreamreader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFile {
	String intString;
	
	public void readFile(File file) {
		
		FileReader fr = null;
		
		BufferedReader bufferedReader = null;
		
		try {
			bufferedReader = new BufferedReader(new FileReader(file));
			String line;
			while((line = bufferedReader.readLine())!= null) {
				intString = line.replaceAll("[^0-9]", "");
				System.out.println("\nIntString : "+intString);;
			}
		} catch (Exception e) {
			return;
		}
		char[] arr = intString.toCharArray();
		int[] intstr = new int[arr.length];
		for (int j = 0; j < intstr.length; j++) {
			intstr[j] = arr[j]-'0';
		}
		for (int j = 0; j < intstr.length; j++) {
			System.out.println(intstr[j]);
		}
	}
	public static void main(String[] args) {
	 
		ReadFile readWriteFile = new ReadFile();
		String readFileName = "C:\\Desktop\\JAVA\\JAVA PROGRAMS\\ExceptionHandling\\newFile.txt";
		File readFile = new File(readFileName);
		 readWriteFile.readFile(readFile);
		
	}

}
