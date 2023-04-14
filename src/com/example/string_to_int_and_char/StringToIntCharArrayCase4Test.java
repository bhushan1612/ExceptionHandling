package com.example.string_to_int_and_char;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class StringToIntCharArrayCase4Test {

	StringToIntCharArrayCase4 stringToIntCharArrayCase4;
	
	StringToIntCharArrayCase4Test(String str){
		stringToIntCharArrayCase4 = new StringToIntCharArrayCase4();
		
		if(str!=null) {
			stringToIntCharArrayCase4.stringToIntConvert(str);
		}else {
			System.err.println("String is :: "+str);
		}
		
	}
	
	public StringToIntCharArrayCase4 getIntArray() {
		
		String FileName = "FileData.txt";
		//create a file of pre defined class File
		File file = new File(FileName);
		//writer is a variable
		FileWriter writer = null;

		try {
			file.createNewFile();
			writer = new FileWriter(file);
			try {
				String fileContent = "Bhushan Mahajan :: 9767***013";
			//write is method of Filewriter
				writer.write(fileContent);
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				writer.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return stringToIntCharArrayCase4;
	}
	
	public static void main(String[] args) {
		String str = "9767277013";
		StringToIntCharArrayCase4Test stringToIntCharArrayCase4Test = new StringToIntCharArrayCase4Test(str);
		int[]ar = stringToIntCharArrayCase4Test.getIntArray().getArray();
		if(ar != null) {
			for (int i = 0; i < ar.length; i++) {
				System.out.println(ar[i]);
			}
		}else {
			System.err.println();
		}
		
	}

}
