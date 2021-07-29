package week2day3;

import java.io.File;

public class DeleteFileDemo {

	public static void main(String[] args) {
		
		File file = new File("data/records_copy.txt");
		System.out.println("Does file exist? " + file.exists());
		boolean results = file.delete();
		System.out.println("Has the file been deleted? " + results);
		
	}

}
