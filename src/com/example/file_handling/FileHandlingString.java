package com.example.file_handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileHandlingString {

	public static void main(String[] args)  {
		String FileName = "JavaClassNotes.txt";
		//create a file of pre defined class File
		File file = new File(FileName);
		//writer is a variable
		FileWriter writer = null;
		try {
			if (file.createNewFile()) {
				try {
					
					writer = new FileWriter(file);
					System.out.println("File Created Successfully.....!");
					try {
						String fileContent = "This is java class Exception"+" Handling with try and finally";
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
			}else {
				System.out.println("File is Already Exist.....!");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
