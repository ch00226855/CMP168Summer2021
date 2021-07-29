package week2day3;

import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;

public class PrintWriterDemo {

	public static void main(String[] args) {
		
		PrintWriter pw = null;
		
		// Write to a new file, or replace existing contents
		try {
			pw = new PrintWriter("data/records.txt"); 
			// if the file does not exist, Java will create the file.
			pw.println("Hello!");
			pw.flush();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if (pw != null) {
				pw.close();
			}
		}
		
		//Append to an existing file.
		try {
			pw = new PrintWriter(new FileOutputStream("data/records.txt", true));
			pw.println("I am appending to this file!");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if (pw != null) {
				pw.close();
			}
		}

	}

}
