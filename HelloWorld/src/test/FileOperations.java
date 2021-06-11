package test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fileOutputStream;
		try {
			 fileOutputStream = new FileOutputStream("abc.txt");
			 String msg = "Welcome to Java!";
		 	 byte byteArray[]=msg.getBytes(); //Converting String Into byte arrary
			 fileOutputStream.write(byteArray);
		   	 System.out.println("Message written to file successfully!");
		} catch (FileNotFoundException fe) {
			fe.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
