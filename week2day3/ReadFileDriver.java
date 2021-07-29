package week2day3;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileDriver {

	public static void main(String[] args) {
		
		FileInputStream file = null;
		Scanner scnr = null;
		
		try {
			file = new FileInputStream("C:/Users/DancyZou/Downloads/temp.txt");
			scnr = new Scanner(file);
			
	//		System.out.println(scnr.nextLine());
	//		System.out.println(scnr.nextInt());
	//		System.out.println(scnr.nextDouble());
	//		System.out.println(scnr.nextBoolean());
	//		System.out.println(scnr.nextLine()); // nextLine() will read a new line character here.
	//		System.out.println(scnr.nextLine());
			
			// load until the end of a file
			while (scnr.hasNext()) {
				System.out.println(scnr.nextLine());
			}
			
		
		} catch (IOException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				file.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		System.out.println("End of program.");
	}

}
