package com.example.filestreamreader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreate {

	public void createFile(File file) {
		String fileContent = "12 A 34 B 56 C 78  D 9  E 10 F 11 G 12 H 13 I 14 J 15 K 16 L 17 M 18 N 19 O 20 P ";

		FileWriter fileWriter = null;
		FileReader fileReader = null;

		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;

		String intString = "";
		String string = "";

		try {
			
			file.createNewFile();

			try {
				
				fileWriter = new FileWriter(file);
				fileWriter.write(fileContent);
				
			} finally {
				try {
					fileWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileCreate fileCreate = new FileCreate();
		String fileName = "FileData.txt";
		File file = new File(fileName);
		fileCreate.createFile(file);
	}

}
