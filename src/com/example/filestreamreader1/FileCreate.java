package com.example.filestreamreader1;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreate {

public void createFile(File file) {

String fileContent = "12 A 34 B 56 C 78  D 9  E 10 F 11 G 12 H 13 I 14 J 15 K 16 L 17 M 18 N 19 O 20 P " + file;

FileWriter writer = null;
FileReader fileReader = null;

FileInputStream fileInputStream = null;
FileOutputStream outputStream = null;

String intString="";
String string="";

try {
          file.createNewFile();
                     
           try {
            writer = new FileWriter(file);
    writer.write(fileContent);
    } catch (IOException e1) {
    e1.printStackTrace();
    }finally {
   
    try {
    writer.close();
    }catch (IOException e) {
e.printStackTrace();
}
    }
         }catch(Exception e) {
         e.getStackTrace();
       }
	
/***********************FileReader*************************/
try {
fileReader = new FileReader(file);
       int i;
       try {
        System.out.print(" Printing data : "+ " "+file);
       
while ((i = fileReader.read()) != -1)

   System.out.print(", "+(char)i);

} catch (IOException e) {
e.printStackTrace();
}
 
} catch (FileNotFoundException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}

/******************* Print File Data Using FileOutputStream *************/
try {

fileInputStream = new FileInputStream(file);
String outputString =null;
System.out.println("*********************");
       try {
               
        byte[] bytes = new byte[8192];
       
        while (fileInputStream.read(bytes) != -1)

outputString = new String(bytes);

} catch (IOException e) {
e.printStackTrace();
}
/******************Separating int & char from String************************/
       System.out.println("String is : "+outputString);
       System.out.println("Separating Int value and String values from"
        + " combined "+ "String "+"\n"+"String value : " +fileContent);
       String a = outputString;
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
 
 
/*********************Writing data in file using FileOutputStream***************/

try {

outputStream = new FileOutputStream("new.txt");

try {
outputStream.write(intString.getBytes());
outputStream.write(string.getBytes());
}catch (Exception e) {

e.printStackTrace();
}

System.out.println("Content writen is done");

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
public void readWriteFile(File file) {

/*********************Reading & Writing data in file using BuffredStream***************/
BufferedReader bufferedReader = null;
BufferedWriter bufferedWriter = null;
System.out.println("inside readWriteFile : "+file.toString());
try {

bufferedReader = new BufferedReader(new FileReader(file)) ;
bufferedWriter = new BufferedWriter(new FileWriter("newFile.txt"));
       String line;
       while ((line = bufferedReader.readLine()) != null) {
          if (line.contains("Datatxt"))
          System.out.println("inside readWriteFile : ");
           
             line = line.replace("Datatxt", " "+"This is new line added");
             bufferedWriter.write(line+"\n");
             bufferedWriter.write("New line added after replacing above line content");
         
       }
    } catch (Exception e) {
       return;
    } finally {
       try {
          if(bufferedReader != null)
          bufferedWriter.close();
       } catch (IOException e) {
          //
       }
       try {
          if(bufferedWriter != null)
          bufferedWriter.close();
       } catch (IOException e) {
         e.printStackTrace();
       }
    }
}
public void readFile(File file) {
FileReader fr = null;
try {
fr = new FileReader(file);
} catch (FileNotFoundException e) {
e.printStackTrace();
}    
try{
if (System.getProperty("os.name").toLowerCase().contains("windows")) {
 String cmd = "rundll32 url.dll,FileProtocolHandler " + file.getCanonicalPath();
 Runtime.getRuntime().exec(cmd);
}
else {
 Desktop.getDesktop().edit(file);
}
}catch(Exception e){
e.printStackTrace();
}
         int i;    
         try {
while((i=fr.read())!=-1)    
System.out.print((char)i);
} catch (IOException e) {
e.printStackTrace();
}finally{    
try {
fr.close();
} catch (IOException e) {
e.printStackTrace();
}
}
}
public static void main(String[] args) {

FileCreate fileCreate = new FileCreate();
String fileName = "Data.txt";
File file = new File(fileName);
fileCreate.createFile(file);
System.out.println("*******************");
String readFileName = "F:\\Java Live Class Example Self\\Exception Handling\\Data.txt";
File readFile = new File(readFileName);
fileCreate.readFile(readFile);
String newFileName = "new.txt";
File newFile = new File(newFileName);
fileCreate.readWriteFile(newFile);

}

}