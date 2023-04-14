package com.example.filestreamreader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReader1 {

	public void fileReader(File file) {
		String fileContent = "12 A 34 B 56 C 78  D 9  E 10 F 11 G 12 H 13 I 14 J 15 K 16 L 17 M 18 N 19 O 20 P ";

		FileWriter fileWriter = null;
		FileReader fileReader = null;

		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;

		String intSting = "";
		String string = "";

		try {

			fileReader = new FileReader(file);
			int i;

			try {
				System.out.println("Printing Data : " + " " + file);

				while ((i = fileReader.read()) != -1)
				System.out.print("," + (char) i);

			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		FileReader1 fileReader = new FileReader1();
		String fileName = "FileData.txt";
		File file = new File(fileName);
		fileReader.fileReader(file);

	}
}
