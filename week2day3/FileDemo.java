package week2day3;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		
		File file = new File("data/words.txt");
		Scanner scnr = new Scanner(file);
		
		System.out.println(scnr.nextLine());
		
		System.out.println(file.getAbsolutePath());
		
		File directory = new File(".");
		
		String[] list = directory.list();
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}

	}

}
