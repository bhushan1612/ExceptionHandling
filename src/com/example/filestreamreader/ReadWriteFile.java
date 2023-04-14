package com.example.filestreamreader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteFile {

	public void writeFile(File file) {
		BufferedReader bufferedReader = null;
		BufferedWriter bufferedWrite = null;
		System.out.println("Inside readWriteFile : "+file.toString());
		try {
			
			bufferedReader = new BufferedReader(new FileReader(file));
			bufferedWrite = new BufferedWriter(new FileWriter("newFile.txt"));
			String line;
			while((line = bufferedReader.readLine())!=null) {
				if(line.contains("FileDatatxt"))
					System.out.println("Inside readWriteFile : ");
				line = line.replace("FileDatatxt"," "+"This is new Line Added");
				bufferedWrite.write(line+"\n");
				bufferedWrite.write("New Line added after replacing above line content");
					
			}
			
		} catch (Exception e) {
			return;
		}finally {
			try {
				if(bufferedReader != null)
					bufferedWrite.close();
			} catch (IOException e) {
				// TODO: handle exception
			}
		}try {
			if(bufferedWrite !=null)
				bufferedWrite.close();
				
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}