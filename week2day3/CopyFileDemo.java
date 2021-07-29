package week2day3;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CopyFileDemo {

	public static void main(String[] args) {

		File file1 = new File("data/recordss.txt");
		File file2 = new File("data/records_copy.txt");
		Scanner scnr = null;
		PrintWriter pw = null;

		try {
			scnr = new Scanner(file1);
			pw = new PrintWriter(file2);

			while(scnr.hasNext()) {
				// read and write one line
				String line = scnr.nextLine();
				pw.println(line);
			} 
			pw.flush();
		} catch (IOException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		} finally {
			if (scnr != null) {
				scnr.close();
			}
			if (pw != null) {
				pw.close();
			}
		}
		


		
		

	}

}
